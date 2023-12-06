package code_vui.extra_assignment.bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Demo {
    public static void fakeData(ArrayList<Labor> list) {
        Labor labor1 = new Labor("001", "Nguyen Van An", 20);
        Labor labor2 = new Labor("002", "Tran Van Bang", 30);
        Labor labor3 = new Labor("003", "Nguyen Van Ba Dao", 10);
        Labor labor4 = new Labor("004", "Ngo Ba Kha", 17);
        Labor labor5 = new Labor("005", "Le Xuan Huan", 25);
        list.add(labor1);
        list.add(labor2);
        list.add(labor3);
        list.add(labor4);
        list.add(labor5);
    }

    public static void output(ArrayList<Labor> list) {
        System.out.println(
                "----------------------------------------------------------------------");
        System.out.println("                          QUAN LY NHAN CONG");
        System.out.println(
                "----------------------------------------------------------------------");
        System.out.printf("%-5s | %-20s | %-10s | %-15s | %-15s\n", "ID", "Name", "Workdays", "Price", "Salary");
        for (Labor labor : list) {
            labor.display();
        }
    }

    public static void modify(ArrayList<Labor> list) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input searching keyword: ");
        String word = scan.nextLine();
        word = word.toUpperCase();
        boolean check = false;
        for (Labor labor : list) {
            if (labor.getName().contains(word)) {
                labor.display();
                check = true;

            }
        }
        for (Labor labor : list) {
            if (labor.getName().contains(word)) {
                if (labor.getName().contains(word)) {
                    System.out.print("Input your expect name: ");
                    String name = scan.nextLine();
                    name = name.toUpperCase();
                    labor.setName(name);
                }
            }
        }
        if (check == false) {
            System.out.println("There are no person's name contains " + word);
        }
        scan.close();
    }

    public static void highestSalary(ArrayList<Labor> list) {

        Integer max = 0;
        for (Labor labor : list) {
            max = Math.max(max, labor.getSalary());
        }
        System.out.println("person has a highest salary is: ");
        for (Labor labor : list) {
            if (max.equals(labor.getSalary())) {
                labor.display();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Labor> list = new ArrayList<>();
        fakeData(list);
        output(list);
        System.out.println();
        modify(list);
        output(list);
        System.out.println();
        highestSalary(list);
    }
}
