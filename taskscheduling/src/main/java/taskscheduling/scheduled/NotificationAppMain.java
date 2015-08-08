package taskscheduling.scheduled;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import taskscheduling.configuration.AppConfig;

/**
 * Created by Ufuk on 08-08-15.
 */
public class NotificationAppMain {

    @SuppressWarnings({"unused", "resource"})
    public static void main(String args[]) {
        AbstractApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
