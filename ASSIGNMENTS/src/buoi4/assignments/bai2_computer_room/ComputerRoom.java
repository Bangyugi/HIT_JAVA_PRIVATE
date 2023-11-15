package buoi4.assignments.bai2_computer_room;

import java.util.ArrayList;
import java.util.Scanner;

public class ComputerRoom {
    private String id;
    private String name;
    private Manager x;
    private Computer y;
    ArrayList<Computer> list = new ArrayList<>();
    Manager manager = new Manager();

    public ComputerRoom() {
    }

    public ComputerRoom(String id, String name, Manager x, Computer y) {
        this.id = id;
        this.name = name;
        this.x = x;
        this.y = y;
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

    public Manager getX() {
        return this.x;
    }

    public void setX(Manager x) {
        this.x = x;
    }

    public Computer getY() {
        return this.y;
    }

    public void setY(Computer y) {
        this.y = y;
    }

    Scanner scan = new Scanner(System.in);

    public void input() {

        System.out.print("Input room's id: ");
        id = scan.nextLine();
        System.out.print("Input room's name: ");
        name = scan.nextLine();
        manager.input();
        System.out.print("Input the number of computer in the room: ");
        int n = scan.nextInt();
        scan.nextLine();
        list.clear();
        for (int i = 0; i < n; i++) {
            Computer computer = new Computer();
            System.out.println();
            computer.input();
            list.add(computer);
        }

    }

    public void output() {
        System.out.printf("%-15s %-15s %-15s %-20s %-15s %-20s %-20s\n", "Room's ID", "Room's name", "Manager's ID",
                "Manager's Name", "Computer's ID", "Computer's type", "Computer's status");
        for (Computer computer : list) {
            System.out.printf("%-15s %-15s %-15s %-20s %-15s %-20s %-20s\n", id, name, manager.getId(),
                    manager.getName(), computer.getId(), computer.getType(), computer.getStatus());
        }
    }

    public void findByComputerType() {
        System.out.print("Input searching keyword: ");
        String word = scan.nextLine();
        System.out.printf("%-15s %-20s %-20s\n", "Computer's ID", "Computer's type", "Computer's status");
        for (Computer computer : list) {
            if (computer.getType().contains(word)) {
                computer.output();
            }
        }
    }

    public void findByComputerId() {
        System.out.print("Input searching keyword: ");
        int number = scan.nextInt();
        scan.nextLine();
        System.out.printf("%-15s %-20s %-20s\n", "Computer's ID", "Computer's type", "Computer's status");
        for (Computer computer : list) {
            if (computer.getId() == number) {
                computer.output();
            }
        }
    }
}
