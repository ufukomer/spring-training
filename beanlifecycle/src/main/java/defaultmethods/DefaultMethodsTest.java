package defaultmethods;

import beanlifecycle.HelloWorld;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 02-05-15.
 */
public class DefaultMethodsTest {
    @Test
    public void default_methods_test() {
        /* Default initialization and destroy methods usage */
        AbstractApplicationContext contextTwo =
                new ClassPathXmlApplicationContext("defaultmethodsconf.xml");

        HelloWorld messageTwo = contextTwo.getBean("helloWorld", HelloWorld.class);
        messageTwo.getMessage();

        contextTwo.registerShutdownHook();
    }
}
