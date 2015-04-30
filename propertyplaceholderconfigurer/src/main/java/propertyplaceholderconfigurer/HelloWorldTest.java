package propertyplaceholderconfigurer;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 30-04-15.
 */
public class HelloWorldTest {

    @Test
    public void hello_world_test() {

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("propertyplaceholderconfigurerconf.xml");

        HelloWorld helloWorld = applicationContext.getBean("helloWorld", HelloWorld.class);
        helloWorld.sayHello();
        helloWorld.sayGoodbye();
    }
}
