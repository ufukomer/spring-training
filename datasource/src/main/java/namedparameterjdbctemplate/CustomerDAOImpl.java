package namedparameterjdbctemplate;

import datasource.Customer;
import jdbctemplate.CustomerRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

import static constants.Constants.TAG;

/**
 * Created by Ufuk on 13-05-15.
 */
@Component("namedParameterJdbcTemplateCustomer")
public class CustomerDAOImpl implements CustomerDAO {

    public final Logger logger = Logger.getLogger(TAG(this));

    @Autowired // Allowing the use of named parameters rather than traditional '?' placeholders.
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    private SimpleJdbcInsert simpleJdbcInsert;

    @Override
    public Customer findCustomerById(int id) {
        String sql = "SELECT * FROM customer WHERE id = :id";
        SqlParameterSource namedParameters = new MapSqlParameterSource("id", Integer.valueOf(id));
        Customer customer = (Customer) namedParameterJdbcTemplate.queryForObject(sql, namedParameters, new CustomerRowMapper());
        return customer;
    }

    @Override
    public Customer findCustomerByName(String firstName) {
        String sql = "SELECT * FROM customer WHERE firstName = :firstName";
        SqlParameterSource namedParameters = new MapSqlParameterSource("firstName", firstName);
        Customer customer = (Customer) namedParameterJdbcTemplate.queryForObject(sql, namedParameters, new CustomerRowMapper());
        return customer;
    }

    @Override // Insert given customer object to database
    public void addCustomer(Customer customer) {

        SqlParameterSource parameters = new BeanPropertySqlParameterSource(customer);
        // We can get generated value by using executeAndReturnKey method
        // We can use void execute method
        Number genId = simpleJdbcInsert.executeAndReturnKey(parameters);
        logger.info("Customer was inserted into database with generated id " + genId);

        // Alternative and longer way to use simpleJdbcInsert
        /*Map<String, Object> parameters = new HashMap<String,Object>(4);
        parameters.put("id", customer.getId());
        parameters.put("name", customer.getName());
        parameters.put("firstName", customer.getFirstName());
        parameters.put("age", customer.getLastName());
        insertCustomer.execute(parameters);*/
    }
}
