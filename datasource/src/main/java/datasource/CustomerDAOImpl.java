package datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Ufuk on 11-05-15.
 */
@Component("customer")
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private DataSource dataSource;

    public Customer getCustomerByName(String name) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Customer customer = null;

        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement("SELECT * FROM customer WHERE firstname = ?");
            preparedStatement.setString(1, name);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                customer = new Customer();
                customer.setId(resultSet.getLong("id"));
                customer.setFirstName(resultSet.getString("firstName"));
                customer.setLastName(resultSet.getString("lastName"));
                customer.setNumber(resultSet.getInt("number"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) connection.close();
                if (preparedStatement != null) preparedStatement.close();
                if (resultSet != null) resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return customer;
    }

    public void saveCustomer() {
        // TODO: Write insert operation
    }
}