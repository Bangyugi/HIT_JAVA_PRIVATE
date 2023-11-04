package buoi3.prepare_in_advance;

import java.util.ArrayList;
import java.util.Scanner;

public class Car_manager {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList a = new ArrayList<>();
        Car car = new Car();

        // String name = scan.nextLine();
        // String ID = scan.nextLine();
        // int year = scan.nextInt();
        // scan.nextLine();
        // double price = scan.nextDouble();
        // String brand = scan.nextLine();

        while (true) {
            System.out.print("The number of car in your list:" + a.size());
            if (a.size() > 0) {
                System.out.println("\t(1) Add a car;");
                System.out.println("\t(2) Remove a car;");
                System.out.println("\t(3) Find a car using car's name;");
                System.out.println("\t(4) Find a car using car's ID;");
                System.out.println("\t(5) Find a car using car's name;");
                System.out.println("\t(6) Sort by car's name");
                System.out.println("\t(7) Sort by car's ID");
                System.out.println("\t(8) Show all car in list");
                System.out.println("\t(9) Exit");
                System.out.print("Input your choice: ");
            }

        }

    }
}
