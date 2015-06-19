package pointcutdefinition;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import pointcutdefinition.bean.Student;

/**
 * Created by Ufuk on 19-06-15.
 */
@Aspect
public class ReturnValueLogger {

    @Pointcut("execution(* pointcutdefinition.service.StudentService.changeStudentName(..))")
    private void namePointcut() {
    }

    @Pointcut("execution(* pointcutdefinition.service.StudentService.changeStudentAge(..))")
    private void agePointcut() {
    }

    // The definition of parameters of changeStudentAge(..) method with 'args' below
    @Pointcut("execution(* pointcutdefinition.service.StudentService.printStudent(..)) && args(student)")
    private void printPointcut(Student student) {
    }

    // We can use the parameters of pointcut with 'args' in advice
    @Before("namePointcut() && args(..,name)")
    private void beforeName(String name) {
        System.out.println("New name: " + name);
    }

    @Before("agePointcut() && args(..,age)")
    private void beforeAge(Integer age) {
        System.out.println("New age: " + age);
    }

    // We can also use the parameters of pointcut with 'args' in pointcut definition
    @Before("printPointcut(student)")
    private void beforePrint(Student student) {
        System.out.println("Name: " + student.getName() + " Age: " + student.getAge());
    }

    // It is possible to use multiple pointcut with '||', '&&' and '!' symbols
    @AfterReturning(pointcut = "namePointcut() || agePointcut()", returning = "retVal")
    private void afterReturningAdvice(Object retVal) {
        System.out.println("Old value: " + retVal);
    }
}