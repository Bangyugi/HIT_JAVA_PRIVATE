import java.util.Date;
import java.util.Scanner;

public class Employee extends Person {
    double salary;

    public Employee(String name, String birthday, double salary) {
        super(name, birthday);
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void getDetail() {

    }

    Scanner scan = new Scanner(System.in);

    public void input() {
        System.out.print("Input employee's name: ");
        String name = scan.nextLine();
        super.setName(name);
        System.out.println("Input employee's birthday: ");
        int n = scan.nextInt();
        // System.out.print("Input day: ");
        int day = n % 10000;
        // System.out.print("Input month: ");
        int month = n / 1000 % 100;
        // System.out.print("Input year: ");
        int year = n / 100000 % 100;
        String date = String.format("%02d/%02d/%04d", day, month, year);
        System.out.println(date);
        super.setBirthday(date);
    }

}
