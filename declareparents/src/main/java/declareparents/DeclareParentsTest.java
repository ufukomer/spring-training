package declareparents;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 19-06-15.
 */
public class DeclareParentsTest {
    @Test
    public void declare_parents_test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("declareparentsconf.xml");

        Key key = context.getBean(Key.class);
        key.setKey("Skeleton Key");
        key.getKey();

        // Alternative: Lockable door = (context.getBean("keyImpl", Lockable.class));
        Lockable door = (Lockable) key;
        door.unlock();
        door.isLocked();
    }
}