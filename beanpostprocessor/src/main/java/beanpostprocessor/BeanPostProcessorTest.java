package beanpostprocessor;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 01-05-15.
 */
public class BeanPostProcessorTest {
    @Test
    public void bean_post_processor_test() {

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("beanpostprocessorconf.xml");

        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
        helloWorld.getMessage();

        context.registerShutdownHook();
    }
}
