package mvcexample.dao;

import mvcexample.model.Employee;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ufuk on 10-07-15.
 */
// That annotation fixed the transaction error in unit test (EmployeeServiceImplTest)
@Transactional(propagation = Propagation.REQUIRED)
public interface EmployeeDao {

    Employee saveEmployee(Employee employee);

    List<Employee> findAllEmployees();

    void deleteEmployeeBySsn(String ssn);
}
