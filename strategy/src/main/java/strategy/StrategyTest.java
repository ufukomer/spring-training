package strategy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 13-04-15.
 */
public class StrategyTest {
   @Test
   public void strategy_test() {
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("strategyconf.xml");
       Context context = applicationContext.getBean("context", Context.class);
       context.executeStrategy(5, 10);
   }
}
