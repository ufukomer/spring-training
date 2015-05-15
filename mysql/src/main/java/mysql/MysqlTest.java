package mysql;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Ufuk on 15-05-15.
 */
public class MysqlTest {
    @Test
    public void mysql_test() {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("mysqlconf.xml");
        EmployeeDAOImpl employee = context.getBean("employeeDaoImpl", EmployeeDAOImpl.class);

        List<Employee> list = employee.getEmployeeList();
        System.out.println(list);
    }
}
