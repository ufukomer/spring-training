package pointcutdefinition.dao;

import pointcutdefinition.bean.Student;

/**
 * Created by Ufuk on 19-06-15.
 */
public interface StudentDAO {

    String studentInfo(Student student);

    String changeStudentName(Student student, String name);

    Integer changeStudentAge(Student student, Integer age);
}
