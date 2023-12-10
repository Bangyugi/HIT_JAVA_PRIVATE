package code_vui.extra_assignment.bai4;

import java.util.ArrayList;
import java.util.List;


public class Lmao {

    

    public static void main(String[] args) {
        List<Classroom> classrooms = new ArrayList<>();
        List<Student> students = new ArrayList<>();

        TestImpl testImpl = new TestImpl();
        testImpl.generateRandomStudents(19, students);

        // Display the generated students
        for (Student student : students) {
            System.out.println(student.toString());
        }

        testImpl.sortByName(students);

        testImpl.searchingByName(students);

        testImpl.danhSachLopHoc(classrooms, students);

        testImpl.soLuongThongKe(classrooms);
    }
}
