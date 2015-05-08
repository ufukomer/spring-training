package strategy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 08-05-15.
 */
public class StrategyTest {
    @Test
    public void strategy_test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("strategyconf.xml");
        StrategyService service = context.getBean("strategyService", StrategyService.class);
        service.executeOperation(5, 5);

        // Show context content
        String[] beans = context.getBeanDefinitionNames();
        for (String bean : beans) {
            System.out.println(bean);
        }
    }
}
