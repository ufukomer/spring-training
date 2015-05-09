package javabasedconfiguration;

import configs.CarConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Ufuk on 09-05-15.
 */
public class JavaBasedConfigurationTest {
    @Test
    public void java_based_configuration_test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
        Car car = context.getBean("car", Car.class);
        car.playRadio();
    }
}
