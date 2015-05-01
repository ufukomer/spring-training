package beanlifecycle;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 30-04-15.
 */
public class BeanLifecycleTest {
    @Test
    public void bean_lifecycle_test() {

        AbstractApplicationContext contextOne =
                new ClassPathXmlApplicationContext("beanlifecycleconf.xml");

        HelloWorld messageOne = contextOne.getBean("helloWorld", HelloWorld.class);
        messageOne.getMessage();

        contextOne.registerShutdownHook();
    }
}
