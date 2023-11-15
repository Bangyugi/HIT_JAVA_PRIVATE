package buoi4.assignments.bai2_computer_room;

import java.util.Scanner;

public class Computer {
    private int id;
    private String type;
    private String status;

    public Computer() {
    }

    public Computer(int id, String type, String status) {
        this.id = id;
        this.type = type;
        this.status = status;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    Scanner scan = new Scanner(System.in);

    public void input() {
        System.out.print("Input computer's id: ");
        this.id = scan.nextInt();
        scan.nextLine();
        System.out.print("Input computer's type: ");
        this.type = scan.nextLine();
        System.out.print("Input computer's status: ");
        this.status = scan.nextLine();
    }

    public void output() {
        System.out.printf("%-15s %-15s %-20s\n", id, type, status);
    }

}
