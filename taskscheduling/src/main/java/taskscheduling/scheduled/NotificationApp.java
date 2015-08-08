package taskscheduling.scheduled;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by Ufuk on 08-08-15.
 */
public class NotificationApp {

    @Scheduled(fixedRate = 5000)
    public void printMessage() {
        System.out.println("I am called by Spring Scheduler");
    }
}
