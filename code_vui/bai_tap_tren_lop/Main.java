package code_vui.bai_tap_tren_lop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void choice1(ArrayList<Student> list, Scanner scan) {

        System.out.print("Nhap so luong sinh vien ban muon them: ");
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ma sinh vien: ");
            String studentId = scan.nextLine();
            System.out.print("Nhap ten sinh vien: ");
            String name = scan.nextLine();
            System.out.print("Nhap tuoi sinh vien: ");
            int age = scan.nextInt();
            scan.nextLine();
            System.out.print("Nhap dia chi: ");
            String address = scan.nextLine();
            Student student = new Student(name, age, address, studentId);
            list.add(student);
        }
    }

    public static void choice2(ArrayList<Student> list) {
        if (list.isEmpty()) {
            System.out.println("Danh sach sinh vien rong.");
        } else {
            System.out.println("Danh sach sinh vien:");
            for (Student student : list) {
                student.output();
            }
        }
    }

    public static void choice3(ArrayList<Student> list, Scanner scan) {
        System.out.print("Nhap ma sinh vien ban muon sua: ");
        String id = scan.nextLine();
        for (Student student : list) {
            if (student.getStudentId().equals(id)) {
                System.out.print("Nhap ma sinh vien: ");
                String studentId = scan.nextLine();
                System.out.print("Nhap ten sinh vien: ");
                String name = scan.nextLine();
                System.out.print("Nhap tuoi sinh vien: ");
                int age = scan.nextInt();
                scan.nextLine();
                System.out.print("Nhap dia chi: ");
                String address = scan.nextLine();
                student.setName(name);
                student.setAge(age);
                student.setStudentId(studentId);
                student.setAddress(address);
            }
        }
    }

    public static void choice4(ArrayList<Student> list, Scanner scan) {
        System.out.print("Nhap ten sinh vien ban muon kiem tra: ");
        String name = scan.nextLine();
        for (Student student : list) {
            if (student.getName().equals(name)) {
                student.study();
            }
        }
    }

    public static void choice5(ArrayList<Student> list, Scanner scan) {
        System.out.print("Nhap ma sinh vien ban muon xoa: ");
        String id = scan.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStudentId().equals(id)) {
                list.remove(list.get(i));
                System.out.println("Da Xoa thong tin sinh vien");
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            System.out.println("\n-------MENU-------");
            System.out.println("(1). Them sinh vien");
            System.out.println("(2). Hien thi thong tin sinh vien");
            System.out.println("(3). Sua thong tin sinh vien");
            System.out.println("(4). Sinh vien con di hoc hay khong");
            System.out.println("(5). Xoa sinh vien");
            System.out.println("(6). Thoat chuong trinh");

            System.out.print("Nhap lua chon: ");
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1: {
                    choice1(list, scan);
                    break;
                }
                case 2: {
                    choice2(list);
                    break;
                }
                case 3: {
                    choice3(list, scan);
                    break;
                }
                case 4: {
                    choice4(list, scan);
                    break;
                }
                case 5: {
                    choice5(list, scan);
                    break;
                }
                case 6: {
                    System.out.println("Da Thoat");
                    return;
                }

                default:
                    break;
            }

        }

    }
}
