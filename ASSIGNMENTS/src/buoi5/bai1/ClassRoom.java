package buoi5.bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ClassRoom {
    public static ArrayList<Student> list = new ArrayList<>();

    public static ArrayList<Address> addressList = new ArrayList<>();
    static {
        Address address1 = new Address("Son Pho", "Huong Son", "Ha Tinh");
        Student student1 = new Student("Tran Van Bang", 19, address1, 111,
                "CNTTTA_01", 3.6f);
        list.add(student1);

        Address address2 = new Address("Phu Tho", "Phu Ly", "Ha Nam");
        Student student2 = new Student("Nguyen Thi Lan", 20, address2, 112,
                "CNTT_02", 3.8f);
        list.add(student2);

        Address address3 = new Address("Bach Mai", "Hai Ba Trung", "Ha Noi");
        Student student3 = new Student("Le Van Anh", 21, address3, 113, "KTMT_01",
                4.0f);
        list.add(student3);

        Address address4 = new Address("Dong Da", "Dong Da", "Ha Noi");
        Student student4 = new Student("Pham Thi Mai", 19, address4, 114, "CNTT_04",
                3.7f);
        list.add(student4);

        Address address5 = new Address("Tran Hung Dao", "Hoan Kiem", "Ha Noi");
        Student student5 = new Student("Do Van Minh", 20, address5, 115, "KHMT_02",
                3.9f);
        list.add(student5);

        Address address6 = new Address("Nguyen Trai", "Thanh Xuan", "Ha Noi");
        Student student6 = new Student("Tran Thi Thu", 21, address6, 116, "KTPM_03",
                3.5f);
        list.add(student6);
    }

    public static void sortByGpa() {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                if (a.getGpa() < b.getGpa())
                    return -1;
                else
                    return 1;
            }
        });
    }

    public static void inputList() {
        for (int i = 1; i <= 555; i++) {
            Student student = new Student();
            student.input();
            System.out.println();
            list.add(student);
            if (student.getId() == 555) {
                break;
            }
        }
    }

    public static void outputList() {
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-20s | %-5s | %-20s | %-20s | %-10s | %-5s | %-10s | %-5s |\n", "Name", "Age", "Commune",
                "District", "City", "ID", "Class", "GPA");
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------");
        for (Student student : list) {
            student.output();
        }
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------");
    }

    public static boolean removeByID(Scanner scan, Student student, int removeID) {
        if (student.getId() == removeID) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n------ Menu ------");
        System.out.println("1. Input student's information");
        System.out.println("2. Show all student");
        System.out.println("3. Rearange student by gpa");
        System.out.println("4. Remove student by ID");
        System.out.println("5. Exit");

        while (true) {
            System.out.print("Input your choice: ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1: {
                    inputList();
                    break;
                }
                case 2: {
                    outputList();
                    break;
                }
                case 3: {
                    sortByGpa();
                    System.out.println("Sorted");
                    break;
                }
                case 4: {
                    System.out.print("Input ID whose student you want to remove: ");
                    int removeID = scan.nextInt();
                    scan.nextLine();
                    for (int i = 0; i < list.size(); i++) {
                        if (removeByID(scan, list.get(i), removeID) == true) {
                            list.remove(list.get(i));
                        }
                    }
                    // nếu dùng foreach có thể dẫn đến "ConcurrentModificationException" vì không
                    // thể thay đổi cấu trúc của danh sách trong khi bạn đang lặp qua nó.
                    break;
                }

                case 5: {
                    scan.close();
                    System.out.println("Exited");
                    return;
                }

                default:
                    break;
            }
        }

    }
}
