package spel;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 08-05-15.
 */
public class SpELTest {
    @Test
    public void spel_test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spelconf.xml");

        City city = context.getBean("city", City.class);
        System.out.println(city);
    }
}
