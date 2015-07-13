package rmiserviceexporter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 13-07-15.
 */
public class Client {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("rmi-client-config.xml");
        Calculation calculation = context.getBean(Calculation.class);
        System.out.println(calculation.cube(-3));
    }
}
