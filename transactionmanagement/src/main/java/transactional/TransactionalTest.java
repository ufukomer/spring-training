package transactional;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 01-06-15.
 */
public class TransactionalTest {
    @Test
    public void transactional_test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("transactionmanagementconfig.xml");
        UserManager manager = context.getBean("userManager", UserManager.class);

        manager.deleteUser(11, "perike");
        //manager.deleteUser("ufukomer");

        //System.out.println(manager.getUsers());
    }
}
