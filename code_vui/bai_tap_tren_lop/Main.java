package code_vui.bai_tap_tren_lop;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    static int listSize = 0;

    public static void dummyData(Student list[]) {
        Student student1 = new Student("Tran Van Bang", 19, "Ha Tinh", "001");
        list[0] = student1;
        listSize++;
        Student student2 = new Student("Dong Binh Nam", 19, "Lam Dong", "002");
        list[1] = student2;
        listSize++;
    }

    public static void choice1(Student list[], Scanner scan) {

        System.out.print("Nhap so luong sinh vien ban muon them: ");
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = listSize; i < listSize + n; i++) {
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
            list[i] = student;
        }
        listSize += n;
    }

    public static void choice2(Student list[]) {
        if (listSize == 0) {
            System.out.println("Danh sach sinh vien rong.");
        } else {
            System.out.println("Danh sach sinh vien:");
            for (int i = 0; i < listSize; i++) {
                list[i].output();
            }
        }
    }

    public static void choice3(Student list[], Scanner scan) {
        System.out.print("Nhap ma sinh vien ban muon sua: ");
        String id = scan.nextLine();
        for (int i = 0; i < listSize; i++) {
            if (list[i].getStudentId().equals(id)) {
                System.out.print("Nhap ma sinh vien: ");
                String studentId = scan.nextLine();
                System.out.print("Nhap ten sinh vien: ");
                String name = scan.nextLine();
                System.out.print("Nhap tuoi sinh vien: ");
                int age = scan.nextInt();
                scan.nextLine();
                System.out.print("Nhap dia chi: ");
                String address = scan.nextLine();
                list[i].setName(name);
                list[i].setAge(age);
                list[i].setStudentId(studentId);
                list[i].setAddress(address);
            }
        }
    }

    public static void choice4(Student list[], Scanner scan) {
        System.out.print("Nhap ten sinh vien ban muon kiem tra: ");
        String name = scan.nextLine();
        for (int i = 0; i < listSize; i++) {
            if (list[i].getName().equals(name)) {
                list[i].study();
            }
        }
    }

    public static void choice5(Student list[], Scanner scan) {
        System.out.print("Nhap ma sinh vien ban muon xoa: ");
        String id = scan.nextLine();
        for (int i = 0; i < listSize; i++) {
            if (list[i].getStudentId().equals(id)) {
                System.out.println("Da Xoa thong tin sinh vien");
                for (int j = i; j < listSize - 1; j++) {
                    list[j] = list[j + 1];
                }
                listSize -= 1;
            }
        }
    }

    public static void choice6(Student list[]) {
        Arrays.sort(list, 0, listSize, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                if (a.getAge() > b.getAge())
                    return -1;
                else
                    return 1;
            }
        });

        // for (int i = 0; i < listSize - 1; i++) {
        // for (int j = i + 1; j < listSize; j++) {
        // if (list[i].getAge() < list[j].getAge()) {
        // Student temp = list[i];
        // list[j] = list[i];
        // list[i] = temp;
        // }
        // }
        // }
    }

    public static void main(String[] args) {
        Student list[] = new Student[100000];
        dummyData(list);
        while (true) {
            System.out.println("\n-------MENU-------");
            System.out.println("(1). Them sinh vien");
            System.out.println("(2). Hien thi thong tin sinh vien");
            System.out.println("(3). Sua thong tin sinh vien");
            System.out.println("(4). Sinh vien con di hoc hay khong");
            System.out.println("(5). Xoa sinh vien");
            System.out.println("(6). Sap xep sinh vien theo tuoi giam dan");
            System.out.println("(7). Thoat chuong trinh");

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
                    choice6(list);
                    break;
                }
                case 7: {
                    System.out.println("Da Thoat");
                    scan.close();
                    return;
                }

                default:
                    break;
            }

        }

    }
}
