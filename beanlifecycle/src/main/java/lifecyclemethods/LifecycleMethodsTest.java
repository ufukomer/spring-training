package lifecyclemethods;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 02-05-15.
 */
public class LifecycleMethodsTest {
    @Test
    public void lifecycle_methods_test() {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("lifecyclemethodsconf.xml");

        System.out.println("Spring Context initialized");

        EmployeeService service = context.getBean("employeeService", EmployeeService.class);
        System.out.println("Employee name: " + service.getEmployee().getName());

        System.out.println("Employee job: " + service.getEmployee().getJob().getTitle());

        context.close();
        System.out.println("Spring context closed");
    }
}
