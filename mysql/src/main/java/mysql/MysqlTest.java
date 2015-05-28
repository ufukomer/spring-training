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

        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("mysqlconf.xml");
        EmployeeDAOImpl employeeDaoImpl = context.getBean("employeeDaoImpl", EmployeeDAOImpl.class);

        boolean isAdded = employeeDaoImpl.addEmployee(
                new Employee(3, "Alan", "Turing", 41));

        System.out.println((isAdded ? "Insert successful" : "Insert failed!"));

        List<Employee> list = employeeDaoImpl.getEmployeeList();
        System.out.println(list);
    }
}
