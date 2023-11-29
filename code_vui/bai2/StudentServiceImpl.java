package code_vui.bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService {
    Scanner scan = new Scanner(System.in);

    public void addStudent(ArrayList<Student> list) {
        Address address = new Address();
        Student student = new Student();
        list.add(student);
    }

    public void deleteStudent(ArrayList<Student> list) {
        System.out.print("Input student's id whose you want to delete: ");
        int keyID = scan.nextInt();
        scan.nextLine();
        for (Student student : list) {
            if (student.getId() == keyID) {
                list.remove(student);
            }
        }
    }

    public void searchStudent(ArrayList<Student> list) {
        System.out.print("Input searching keyword: ");
        String keyword = scan.nextLine();
        for (Student student : list) {
            if (student.getName().contains(keyword)) {
                System.out.println(student.toString());
            }
        }
    }

    public void sortedStudent(ArrayList<Student> list) {
        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                if (a.getScore() > b.getScore()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
    }

    public void showAllStudent(ArrayList<Student> list) {
        for (Student student : list) {
            System.out.println(student.toString());
        }
    }

}
