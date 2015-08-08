package mvcexample.service;


import mvcexample.model.Employee;

import java.util.List;

/**
 * Created by Ufuk on 10-07-15.
 */
public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> findAllEmployees();

    void deleteEmployeeBySsn(String ssn);
}
