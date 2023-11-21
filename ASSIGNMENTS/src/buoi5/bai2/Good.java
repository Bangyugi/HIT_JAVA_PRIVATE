package buoi5.bai2;

import java.util.Scanner;

public class Good {
    private String name;
    private String unit;

    public Good() {
    }

    public Good(String name, String unit) {
        this.name = name;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Good [name=" + name + ", unit=" + unit + "]";
    }

    Scanner scan = new Scanner(System.in);

    public void intput(String name) {

        setName(name);
        System.out.print("Input unit: ");
        this.unit = scan.nextLine();
    }

    public void output() {
        System.out.println("---\nGood");
        System.out.println("Name: " + getName());
        System.out.println("Unit: " + getUnit());
    }

}
