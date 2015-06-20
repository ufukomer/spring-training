package pointcutdefinition.dao.impl;

import pointcutdefinition.domain.Student;
import pointcutdefinition.dao.StudentDAO;

/**
 * Created by Ufuk on 19-06-15.
 */
public class StudentDAOImpl implements StudentDAO {
    @Override
    public String studentInfo(Student student) {
        return "Name: " + student.getName()
                + " "
                + "Age: " + student.getAge();
    }

    @Override
    public String changeStudentName(Student student, String name) {
        String temp = student.getName();
        student.setName(name);
        return temp;
    }

    @Override
    public Integer changeStudentAge(Student student, Integer age) {
        Integer temp = student.getAge();
        student.setAge(age);
        return temp;
    }
}
