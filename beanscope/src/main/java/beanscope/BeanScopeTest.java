package beanscope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 17-04-15.
 */
public class BeanScopeTest {

    @Test
    public void bean_scope_test() {

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beanscopeconf.xml");

        Message messageOne = applicationContext.getBean("message", Message.class);
        Message messageTwo = applicationContext.getBean("message", Message.class);

        // Message objects reside in different addresses
        System.out.println(messageOne.toString() + "\n" + messageTwo.toString());

        messageOne.setMessage("Text message has been changed");

        // Text objects reside in same address
        System.out.println(messageOne.getMessage() + "\n" + messageTwo.getMessage());
    }
}
