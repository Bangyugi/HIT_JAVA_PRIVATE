package buoi4.assignments.bai2_computer_room;

import java.util.Scanner;

public class Manager {
    private String id;
    private String name;

    public Manager() {
    }

    public Manager(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Scanner scan = new Scanner(System.in);

    public void input() {
        System.out.println();
        System.out.print("Input manager's id: ");
        this.id = scan.nextLine();
        System.out.print("Input manager's name: ");
        this.name = scan.nextLine();

    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                "}";
    }

    public String output() {
        return toString();
    }
}
