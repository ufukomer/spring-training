package pointcutdefinition.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pointcutdefinition.bean.Student;
import pointcutdefinition.dao.StudentDAO;

/**
 * Created by Ufuk on 19-06-15.
 */
@Component("service")
public class StudentService {

    @Autowired
    private StudentDAO studentDAO;

    public void printStudent(Student student) {
        // 'beforePrint' method provide the code below via 'printPointcut'
        /*System.out.println(studentDAO.studentInfo(student));*/
    }

    public String changeStudentName(Student student, String name) {
        return studentDAO.changeStudentName(student, name);
    }

    public Integer changeStudentAge(Student student, Integer age) {
        return studentDAO.changeStudentAge(student, age);
    }
}
