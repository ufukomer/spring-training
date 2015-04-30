package beanlifecycle;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 30-04-15.
 */
public class HelloWorldTest {
    @Test
    public void hello_world_test() {

        AbstractApplicationContext contextOne =
                new ClassPathXmlApplicationContext("beanlifecycleconf.xml");

        HelloWorld messageOne = contextOne.getBean("helloWorld", HelloWorld.class);
        messageOne.getMessage();

        contextOne.registerShutdownHook();

        /* Default initialization and destroy methods usage */
//        AbstractApplicationContext contextTwo =
//                new ClassPathXmlApplicationContext("default-methodconf.xml");
//
//        HelloWorld messageTwo = contextTwo.getBean("helloWorld", HelloWorld.class);
//        messageTwo.getMessage();
//
//        contextTwo.registerShutdownHook();
    }
}
