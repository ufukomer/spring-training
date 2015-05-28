package mysql;

import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * Created by Ufuk on 15-05-15.
 */
public class EmployeeDAOImpl extends JdbcDaoSupport implements EmployeeDAO {

    @Override
    public List<Employee> getEmployeeList() {
        String sql = "SELECT * FROM employee";
        return getJdbcTemplate().query(sql, new EmployeeRowMapper());
    }

    @Override
    public Employee getEmployeeByName(String name) {
        ResultSetExtractor<Employee> employeeResultSetExtractor = new EmployeeExtractor();
        String sql = "SELECT * FROM employee WHERE firstName = ?";
        return getJdbcTemplate().query(sql, employeeResultSetExtractor, name);
    }

    @Override
    public boolean addEmployee(Employee employee) {

        // If is there any employee with this id in database
        // If it is ResultSetExtractor get an employee with null firstName value
        if (getEmployeeById(employee.getId()).getFirstName() != null) {
            return false;
        } else {

            String sql = "INSERT INTO employee VALUES (?,?,?,?)";

            // Those params will be inserted
            int id = employee.getId();
            String firstName = employee.getFirstName();
            String lastName = employee.getLastName();
            int age = employee.getAge();

            Object[] params = new Object[]{id, firstName, lastName, age};

            getJdbcTemplate().update(sql, params);

            return true;
        }
    }

    @Override
    public Employee getEmployeeById(int id) {
        ResultSetExtractor<Employee> employeeResultSetExtractor = new EmployeeExtractor();
        String sql = "SELECT * FROM employee WHERE id = ?";
        return getJdbcTemplate().query(sql, employeeResultSetExtractor, id);
    }
}
