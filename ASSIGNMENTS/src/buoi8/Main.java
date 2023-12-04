package buoi8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University university = new University();

        while (true) {

            System.out.println("\n---------- MENU ----------");
            System.out.println("(1). Hien thi thong tin sinh vien");
            System.out.println("(2). Hien thi thong tin khoa hoc");
            System.out.println("(3). Them sinh vien");
            System.out.println("(4). Xoa sinh vien");
            System.out.println("(5). Them khoa hoc");
            System.out.println("(6). Xoa khoa hoc");
            System.out.println("(7). Dang ki khoa hoc moi cho sinh vien");
            System.out.println("--------------------------");
            System.out.print("Input your decision: ");
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1: {
                    university.getStudent();
                    break;
                }
                case 2: {
                    university.getCourse();
                    break;
                }
                case 3: {
                    university.addStudent();
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    break;
                }
                case 6: {
                    break;
                }
                case 7: {
                    break;
                }

                default:
                    break;
            }
        }
    }
}
