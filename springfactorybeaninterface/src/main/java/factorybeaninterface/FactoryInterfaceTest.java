package factorybeaninterface;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 26-04-15.
 */
public class FactoryInterfaceTest {

    @Test
    public void factory_interface_test() {

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("springfactorybeaninterfaceconf.xml");

        Employee manager = applicationContext.getBean("manager", Employee.class);
        System.out.println(manager);

        Employee director = applicationContext.getBean("director", Employee.class);
        System.out.println(director);
    }

}
