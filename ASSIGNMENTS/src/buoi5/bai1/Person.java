package buoi5.bai1;

import java.util.Scanner;

public class Person {
    protected String name;
    protected int age;
    protected Address address;

    public Person() {
    }

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        address.input();
        this.address = address;
    }

    Scanner scan = new Scanner(System.in);

    public void input() {
        System.out.print("Input name: ");
        this.name = scan.nextLine();
        System.out.print("Input age: ");
        this.age = scan.nextInt();
        scan.nextLine();
    }

    public void output() {
        System.out.printf("| %-20s | %-5s |", getName(), getAge());
        address.output();
    }

}
