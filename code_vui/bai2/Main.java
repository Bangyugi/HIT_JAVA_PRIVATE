package code_vui.bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void dummydata(ArrayList<Student> list) {
        Address address1 = new Address("Huong Son", "Ha Tinh");
        Student student1 = new Student("Tran Van Bang", (short) 19, address1, 8.5);
        list.add(student1);
        Address address2 = new Address("Ba Vi", "Ha Noi");
        Student student2 = new Student("Ngo Thi Tu Khuyen", (short) 19, address2, 9.25);
        list.add(student2);
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        dummydata(list);
        StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
        while (true) {

            Scanner scan = new Scanner(System.in);
            System.out.println("\n---MENU--");
            System.out.println("(1). add student");
            System.out.println("(2). delete student by id");
            System.out.println("(3). search student by name");
            System.out.println("(4). sort list of student");
            System.out.println("(5). show all student");
            System.out.print("Input your decision: ");

            int choice = scan.nextInt();
            switch (choice) {
                case 1: {
                    studentServiceImpl.addStudent(list);
                    break;
                }

                case 2: {
                    studentServiceImpl.deleteStudent(list);
                    break;
                }

                case 3: {
                    studentServiceImpl.searchStudent(list);
                    break;
                }

                case 4: {
                    studentServiceImpl.sortedStudent(list);
                    break;
                }

                case 5: {
                    studentServiceImpl.showAllStudent(list);
                    break;
                }

                case 6: {
                    scan.close();
                    return;
                }

                default:
                    break;
            }

        }
    }
}
