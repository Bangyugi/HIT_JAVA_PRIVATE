package buoi5.bai1;

import java.util.Scanner;

public class Student extends Person {
    private int id;
    private String nameClass;
    private float gpa;
    private final float criteria = 2;

    public Student() {
    }

    public Student(int id, String nameClass, float gpa) {
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public Student(String name, int age, Address address, int id, String nameClass, float gpa) {
        super(name, age, address);
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public float getCriteria() {
        return criteria;
    }

    Scanner scan = new Scanner(System.in);

    public void input() {
        super.input();
        Address address = new Address();
        super.setAddress(address);
        System.out.print("Input ID: ");
        this.id = scan.nextInt();
        scan.nextLine();
        System.out.print("Input class name: ");
        this.nameClass = scan.nextLine();
        System.out.print("Input gpa: ");
        this.gpa = scan.nextFloat();
        scan.nextLine();

    }

    public void output() {
        super.output();
        System.out.printf(" %-5s | %-10s | %-5s |\n", getId(), getNameClass(), getGpa());
    }

    public boolean checkFall() {
        return gpa < criteria;
    }
}
