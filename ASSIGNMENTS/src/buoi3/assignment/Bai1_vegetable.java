package buoi3.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai1_vegetable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Vegetable> list = new ArrayList<>();
        while (true) {

            // System.out.print("\n-------------------------------------\n");
            // System.out.println(" (1) Input a new vegetable into list");
            // System.out.println(" (2) Show all the list");
            System.out.println(" (3) Sort by revenue");
            System.out.println(" (4) Group by unit");
            System.out.println(" (5) Search a vegetable");
            System.out.print(" (6) EXIT");
            System.out.print("\n-------------------------------------\n");
            System.out.print("Input your choice: ");
            Integer choice = scan.nextInt();
            System.out.println();

            switch (choice) {
                case 1: {
                    scan.nextLine();
                    System.out.print("Input ID: ");
                    String id = scan.nextLine();
                    System.out.print("Input name: ");
                    String name = scan.nextLine();
                    System.out.print("Input unit: ");
                    String unit = scan.nextLine();
                    System.out.print("Input quantity sold: ");
                    int quantitySold = scan.nextInt();
                    System.out.print("Input sale: ");
                    int sale = scan.nextInt();
                    System.out.print("Input price: ");
                    double price = scan.nextDouble();
                    Vegetable vegetable = new Vegetable(id, name, unit, quantitySold, sale,
                            price);
                    list.add(vegetable);
                    // ------------ EXAMPLE LIST INPUT ------------
                    // Vegetable v1 = new Vegetable("1", "Carrot", "Kg", 15, 5, 10000);
                    // Vegetable v2 = new Vegetable("2", "Potato", "Kg", 10, 5, 10000);
                    // Vegetable v3 = new Vegetable("3", "Tomato", "Kg", 5, 5, 5000);
                    // Vegetable v4 = new Vegetable("4", "Green Chilli", "G", 20, 0, 3000);
                    // Vegetable v5 = new Vegetable("5", "Beans", "G", 5, 10, 10000);
                    // list.add(v1);
                    // list.add(v2);
                    // list.add(v3);
                    // list.add(v4);
                    // list.add(v5);

                    break;
                }
                case 2: {
                    System.out.printf("%-4s %-15s %-7s %-15s %-7s %-10s %-10s\n", "ID", "Name", "Unit", "Quantity sold",
                            "Sale", "Price", "Revenue");
                    for (Vegetable vegetable : list) {
                        vegetable.display();
                    }
                    break;
                }
                case 3: {
                    Collections.sort(list, new sortByRevenue());
                    break;
                }
                case 4: {
                    Collections.sort(list, new sortByUnit());
                    break;
                }
                case 5: {
                    System.out.print("Input the keyword: ");
                    String word = scan.nextLine();
                    for (Vegetable vegetable : list) {
                        if (vegetable.getName().contains(word)) {
                            vegetable.display();
                        }
                    }
                    break;
                }
                case 6: {
                    scan.close();
                    return;
                }

                default:
                    break;
            }
        }
    }
}
