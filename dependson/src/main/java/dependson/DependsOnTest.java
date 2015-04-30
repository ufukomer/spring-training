package dependson;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 16-04-15.
 */
public class DependsOnTest {
    @Test
    public void depends_on_test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("dependsonconf.xml");
        Water water = context.getBean("water", Water.class);
    }
}
