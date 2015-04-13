package helloworld;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 12-04-15.
 */
public class HelloWorldTest {

    @Test
    public void hello_world_test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("springhelloworldconf.xml");
        HelloWorldContext helloWorldContext = context.getBean("context", HelloWorldContext.class);
        helloWorldContext.showMessage();
    }
}