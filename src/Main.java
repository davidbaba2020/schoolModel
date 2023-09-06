import PriorityExample.Student;
import PriorityExample.StudentService;
import enus.DESIGNATION;
import models.Staff;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Staff staff1 = new Staff();
        staff1.setId(2);
        Staff staff12 = new Staff();
        staff12.setId(1);
        Staff staff3 = new Staff();
        staff3.setId(3);

        List<Staff> st = new ArrayList<>();
        st.add(staff1);
        st.add(staff12);
        st.add(staff3);

        Collections.sort(st);


        System.out.println(staff1);
        System.out.println(st);
        for (Staff s: st) {
            System.out.println(s);
        }


        Student s1 = new Student();
            s1.setName("Student1");
            s1.setScore(10);
        Student s2 = new Student();
            s2.setName("Student2");
            s2.setScore(12);
        Student s3 = new Student();
            s3.setName("Student3");
            s3.setScore(13);
        Student s4 = new Student();
            s4.setName("Student4");
            s4.setScore(3);

            List<Student> studentList = new ArrayList<>();
                            studentList.add(s1);
                            studentList.add(s2);
                            studentList.add(s3);
                            studentList.add(s4);

        System.out.println(studentList);
        Collections.sort(studentList);
        System.out.println(studentList);

        StudentService studentService = new StudentService();

        studentService.giveAdmission(studentList);

        System.out.println("***********************Link list stuents*********************************");
        LinkedList<Student> studentList2 = new LinkedList<>();
            studentList2.add(s1);
            studentList2.add(s2);
        studentService.giveAdmission(studentList2);

        System.out.println(studentList2);
    }

}