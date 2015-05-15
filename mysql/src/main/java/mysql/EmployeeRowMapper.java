package mysql;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Ufuk on 15-05-15.
 */
public class EmployeeRowMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee = new Employee();
        employee.setId(rs.getInt("id"));
        employee.setFirstName(rs.getString("firstName"));
        employee.setLastName(rs.getString("lastName"));
        employee.setAge(rs.getInt("age"));
        return employee;
    }
}
