package buoi5.bai2;

import java.util.Scanner;

public class Person {
    private String name;
    private String address;
    private String STK;

    public Person() {
    }

    public Person(String name, String address, String STK) {
        this.name = name;
        this.address = address;
        this.STK = STK;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSTK() {
        return this.STK;
    }

    public void setSTK(String STK) {
        this.STK = STK;
    }

    public Person name(String name) {
        setName(name);
        return this;
    }

    public Person address(String address) {
        setAddress(address);
        return this;
    }

    public Person STK(String STK) {
        setSTK(STK);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", address='" + getAddress() + "'" +
                ", STK='" + getSTK() + "'" +
                "}";
    }

    Scanner scan = new Scanner(System.in);

    public void input() {
        System.out.print("Input name: ");
        this.name = scan.nextLine();
        System.out.print("Input address: ");
        this.address = scan.nextLine();
        System.out.print("Input STK: ");
        this.STK = scan.nextLine();
    }

    public void output() {
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Number of banking account: " + getSTK());
    }

}
