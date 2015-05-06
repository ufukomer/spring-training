package utilnamespace;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 06-05-15.
 */
public class UtilNamespaceTest {
    @Test
    public void util_namespace_test() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("utilnamesapceconf.xml");

        Calendar wallCalendar = context.getBean("wallCalendar", Calendar.class);
        System.out.println(wallCalendar);

        Calendar deskCalendar = context.getBean("deskCalendar", Calendar.class);
        System.out.println(deskCalendar);

        Time time = context.getBean("time", Time.class);
        System.out.println(time.getTimeZone().getProperty("time_zone") +
                time.getTimeZone().getProperty("city"));

        System.out.println("Month List: " + wallCalendar.getMonths());
    }
}
