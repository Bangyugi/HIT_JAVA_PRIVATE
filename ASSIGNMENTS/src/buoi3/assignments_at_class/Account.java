package buoi3.assignments_at_class;

import java.util.Objects;

public class Account {
    private int ID;
    private String name;
    private int balance;
    private int amount;

    public Account(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public Account(int ID, String name, int balance) {
        this.ID = ID;
        this.name = name;
        this.balance = balance;
    }

    public Account() {
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }

    public void display() {
        System.out.println("Your Banking account's information:");
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

}
