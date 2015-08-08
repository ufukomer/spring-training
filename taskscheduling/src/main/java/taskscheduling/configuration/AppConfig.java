package taskscheduling.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import taskscheduling.scheduled.NotificationApp;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by Ufuk on 08-08-15.
 */
@Configuration
@EnableScheduling // @Scheduled
@EnableAsync // @Async
@ComponentScan(basePackages = "taskscheduling")
public class AppConfig implements SchedulingConfigurer {

    @Bean
    public NotificationApp bean() {
        return new NotificationApp();
    }

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.setScheduler(taskExecutor());
    }

    @Bean(destroyMethod = "shutdown")
    public Executor taskExecutor() {
        return Executors.newScheduledThreadPool(10);
    }
}
