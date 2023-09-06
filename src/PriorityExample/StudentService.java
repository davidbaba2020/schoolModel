package PriorityExample;

import java.util.List;

public class StudentService {

    public void giveAdmission(List<Student> student) {
        for (Student s: student) {
            System.out.println(s);
        }
    }
}
