package beandefinitioninheritance;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 05-05-15.
 */
public class BeanDefInheritanceTest {
    @Test
    public void bean_def_inheritance_test() {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("beaninheritanceconf.xml");

        Car clio = context.getBean("clio", Car.class);
        clio.showSpecifications();

        Car fiesta = context.getBean("fiesta", Car.class);
        fiesta.showSpecifications();

        Car a5 = context.getBean("a5", Car.class);
        a5.showSpecifications();
    }
}