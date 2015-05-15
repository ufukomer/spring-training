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
        String sql = "SELECT * FROM employee WHERE firstName =?";
        return getJdbcTemplate().query(sql, employeeResultSetExtractor, name);
    }
}
