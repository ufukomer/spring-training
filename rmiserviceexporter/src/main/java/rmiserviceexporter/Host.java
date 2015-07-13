package rmiserviceexporter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 13-07-15.
 */
public class Host {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("rmi-server-config.xml");
        System.out.println("Please wait for client request...");
    }
}
