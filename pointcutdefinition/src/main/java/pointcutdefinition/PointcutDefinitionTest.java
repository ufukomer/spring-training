package pointcutdefinition;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pointcutdefinition.bean.Student;
import pointcutdefinition.service.StudentService;

/**
 * Created by Ufuk on 19-06-15.
 */
public class PointcutDefinitionTest {
    @Test
    public void pointcut_definition_test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("pointcutdefinitionconf.xml");

        Student student = context.getBean("student", Student.class);
        StudentService service = context.getBean("service", StudentService.class);

        service.printStudent(student);
        service.changeStudentName(student, "Lillian");
        service.changeStudentAge(student, 30);
        service.printStudent(student);
    }
}