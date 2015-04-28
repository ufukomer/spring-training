package listinjection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 16-04-15.
 */
public class ListInjectionTest {
    @Test
    public void list_injection_test() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("springlistinjectionconf.xml");
        JavaCollection javaCollection =
                applicationContext.getBean("javaCollection", JavaCollection.class);

        javaCollection.getList();
        javaCollection.getMap();
        javaCollection.getProperties();
        javaCollection.getSet();
    }
}
