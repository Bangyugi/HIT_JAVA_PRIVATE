package buoi3.assignments_at_class;

import java.util.Scanner;

public class Tess_1 {
    public static void main(String[] args) {
        Account a = new Account();
        Scanner scan = new Scanner(System.in);
        System.out.print("Input ID: ");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.print("Input name: ");
        String name = scan.nextLine();
        System.out.print("Input balance: ");
        int balance = scan.nextInt();
        a.setID(id);
        a.setName(name);
        a.setBalance(balance);
        a.display();
        System.out.println();
        System.out.print("Input deposit amount: ");
        int amount = scan.nextInt();
        a.deposit(amount);
        a.display();
        System.out.println();
        System.out.print("Input withdraw amount: ");
        amount = scan.nextInt();
        a.withdraw(amount);
        a.display();
        scan.close();
    }
}
