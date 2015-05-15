package mysql;

import java.util.List;

/**
 * Created by Ufuk on 15-05-15.
 */
public interface EmployeeDAO {

    List<Employee> getEmployeeList();

    Employee getEmployeeByName(String name);
}
