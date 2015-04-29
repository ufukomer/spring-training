package namespace;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 29-04-15.
 */
public class NamespaceTest {
    @Test
    public void namespace_test() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("namespaceconf.xml");

        Employee employee = applicationContext.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}
