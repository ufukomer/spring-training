package jdbctemplate;

import datasource.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

import static constants.Constants.TAG;

/**
 * Created by Ufuk on 13-05-15.
 */
@Component("jdbcTemplateCustomer")
public class CustomerDAOImpl implements CustomerDAO {

    public final Logger logger = Logger.getLogger(TAG(this));

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Customer getCustomerByName(String name) {
        ResultSetExtractor<Customer> customerResultSetExtractor = new CustomerExtractor();
        String sql = "SELECT * FROM customer WHERE firstName =?";
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

    @Override
    public List<Customer> getCustomerList() {
        String sql = "SELECT * FROM customer";
        return jdbcTemplate.query(sql, new CustomerRowMapper());
    }

    @Override // This method writes a file which contains customer datum with given name.
    public void writeCustomerToFile(String name) {

        RowCallbackHandler handler = new RowCallbackHandler() {

            BufferedWriter bufferedWriter;

            @Override
            public void processRow(ResultSet rs) throws SQLException {

                try {

                    bufferedWriter = new BufferedWriter(new FileWriter(new File("src\\main\\java\\output\\" + name + ".txt")));

                    StringBuffer buffer = new StringBuffer();

                    buffer.append("ID: ").append(rs.getInt("id"))
                            .append("\n");
                    buffer.append("Name: ").append(rs.getString("firstName"))
                            .append("\n");
                    buffer.append("Last Name: ").append(rs.getString("lastName"))
                            .append("\n");
                    buffer.append("Number: ").append(rs.getInt("number"))
                            .append("\n");

                    bufferedWriter.write(buffer.toString());

                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (bufferedWriter != null) {
                            bufferedWriter.close();
                            logger.info("BufferedWriter has been flushed then closed.");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        String sql = "SELECT * FROM customer WHERE firstName=?";
        jdbcTemplate.query(sql, handler, name);
    }

    @Override
    public int[] deleteCustomerByName(List<Customer> customerList, String name) {

        String sql = "DELETE FROM customer WHERE firstName = ?";

        int[] deleteCounts = jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        // ParameterIndex is ..th '?' in SQL string
                        ps.setString(1, "Okan");
                    }

                    @Override
                    public int getBatchSize() {
                        return customerList.size();
                    }
                }
        );
                return deleteCounts;
    }
}
