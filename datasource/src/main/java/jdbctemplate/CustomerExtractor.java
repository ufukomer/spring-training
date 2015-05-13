package jdbctemplate;

import datasource.Customer;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Ufuk on 13-05-15.
 */
public class CustomerExtractor implements ResultSetExtractor {

    @Override
    public Object extractData(ResultSet rs) throws SQLException, DataAccessException {

        Customer customer = new Customer();

        if(rs.next()){
            String firstName= rs.getString("firstName");
            String lastName = rs.getString("lastName");
            int number = rs.getInt("number");
            int id = rs.getInt("id");

            customer.setId(id);
            customer.setFirstName(firstName);
            customer.setLastName(lastName);
            customer.setNumber(number);
        }

        return customer;
    }
}
