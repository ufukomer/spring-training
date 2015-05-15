package mysql;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Ufuk on 15-05-15.
 */
public class EmployeeExtractor implements ResultSetExtractor {
    @Override
    public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
        Employee customer = new Employee();

        if (rs.next()) {
            int id = rs.getInt("id");
            String firstName = rs.getString("firstName");
            String lastName = rs.getString("lastName");
            int age = rs.getInt("age");

            customer.setId(id);
            customer.setFirstName(firstName);
            customer.setLastName(lastName);
            customer.setAge(age);
        }

        return customer;
    }
}
