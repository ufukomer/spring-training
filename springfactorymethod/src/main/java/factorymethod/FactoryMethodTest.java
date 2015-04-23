package factorymethod;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 22-04-15.
 */
public class FactoryMethodTest {
    @Test
    public void factory_method_test() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("springfactorymethodconf.xml");
        Informer informer = applicationContext.getBean("informer", Informer.class);
        informer.printInfo();
    }
}