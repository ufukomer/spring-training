import mvcexample.configuration.TestConfig;
import mvcexample.dao.EmployeeDao;
import mvcexample.model.Employee;
import org.joda.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.math.BigDecimal;

/**
 * Created by Ufuk on 08-08-15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
// TestConfig.class or AppConfig.class it doesn't matter.
// Spring will inject EmployeeDaoImpl to employeeDao in any case.
// (See. @Autowired below)
@ContextConfiguration(classes = TestConfig.class)
public class EmployeeServiceImplTest {

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void save_employee_test() {
        Employee employee = new Employee();
        employee.setJoiningDate(LocalDate.now());
        employee.setName("Ufuk");
        employee.setSalary(BigDecimal.valueOf(1500));
        employee.setSsn("1");

        final Employee result = this.employeeDao.saveEmployee(employee);
        Assert.assertEquals(result.getName(), "Ufuk");
    }

    // TODO: Write the test code for findAllEmployees in EmployeeServiceImpl

    // TODO: Write the test code for deleteEmployeeBySsn in EmployeeServiceImpl
}
