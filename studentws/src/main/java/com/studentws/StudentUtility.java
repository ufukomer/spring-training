package com.studentws;

import com.studentws.soap.Student;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ufuk on 16-07-15.
 */
@Component
public class StudentUtility {

    private Map<Integer, Student> studentMap = new HashMap<Integer, Student>();

    public StudentUtility() {
        Student s1 = new Student();
        s1.setStudentId(1);
        s1.setName("Ram");
        s1.setAge(20);
        s1.setClazz("ABC");
        studentMap.put(1, s1);
        Student s2 = new Student();
        s2.setStudentId(2);
        s2.setName("Shyam");
        s2.setAge(22);
        s2.setClazz("EFG");
        studentMap.put(2, s2);
    }

    public Student getStudent(int studentId) {
        return studentMap.get(studentId);
    }
}
