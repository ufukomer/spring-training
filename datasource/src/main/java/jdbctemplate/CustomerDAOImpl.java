package jdbctemplate;

import datasource.Customer;
import datasource.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

/**
 * Created by Ufuk on 13-05-15.
 */
@Component("jdbcTemplateCustomer")
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Customer getCustomerByName(String name) {
        ResultSetExtractor<Customer> customerResultSetExtractor = new CustomerExtractor();
        String sql = "Select * from customer where firstName =?";
        return jdbcTemplate.query(sql, customerResultSetExtractor, name);

        // We can also use row mapper instead extractor to get customer's attributes
        /*return (Customer)jdbcTemplate.queryForObject(sql, new Object[] { name }, new CustomerRowMapper());*/
    }

    @Override
    public void saveCustomer(Customer customer) {
        String sql = "INSERT INTO customer (firstName, lastName, number) values (?,?,?)";
        jdbcTemplate.update(sql, customer.getFirstName(),
                customer.getLastName(), customer.getNumber());
    }
}
