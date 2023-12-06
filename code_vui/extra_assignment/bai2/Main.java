package code_vui.extra_assignment.bai2;

import java.util.Scanner;

public class Main {
    public static int retiredAge(Employee employee) {
        // int age = employee.getAge();
        if ((employee.getGender().equals("Nam") || employee.getGender().equals("Male"))) {
            int age = 60 - employee.getAge();
            return Math.max(0, age);
        } else {
            int age = 56 - employee.getAge();
            return Math.max(0, age);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        String name = scan.nextLine();
        System.out.print("Nhap tuoi: ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.print("Nhap gioi tinh: ");
        String gender = scan.nextLine();
        System.out.print("Nhap dia chi: ");
        String address = scan.nextLine();
        System.out.print("Nhap so dien thoai: ");
        String phoneNumber = scan.nextLine();
        System.out.print("Nhap bo phan: ");
        String department = scan.nextLine();
        System.out.print("Nhap ngay cong: ");
        int daysOfWork = scan.nextInt();
        scan.nextLine();
        Employee employee = new Employee(name, age, gender, address, phoneNumber, department, daysOfWork);
        System.out.println(employee.toString(retiredAge(employee)));
        scan.close();
    }
}
