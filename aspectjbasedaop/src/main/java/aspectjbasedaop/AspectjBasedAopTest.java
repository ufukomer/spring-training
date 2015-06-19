package aspectjbasedaop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 19-06-15.
 */
public class AspectjBasedAopTest {
    @Test
    public void aspectj_based_aop_test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aspectjbasedaopconf.xml");

        Student student = context.getBean("student", Student.class);

        student.getName();
        student.getAge();
        student.printThrowException();
    }
}
