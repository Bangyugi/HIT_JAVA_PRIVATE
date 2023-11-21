package buoi5.codeError;

import java.util.Scanner;

public class Person {
    private String name;
    private String address;
    private String STK;

    public Person() {
    }

    public Person(String name, String address, String sTK) {
        this.name = name;
        this.address = address;
        STK = sTK;
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

    Scanner scan = new Scanner(System.in);

    public void input() {
        System.out.print("Input name: ");
        this.name = scan.nextLine();
        System.out.print("Input address: ");
        this.address = scan.nextLine();
        System.out.print("Input number of banking account: ");
        this.STK = scan.nextLine();

    }

    public void output() {
        System.out.println("Name: " + getName());
        System.out.println("STK: " + getSTK());
        System.out.println("Address: " + getAddress());

    }

}
