package buoi5.codeError;

import java.util.Scanner;

public class Good {
    String name;
    String unit;

    Scanner scan = new Scanner(System.in);

    public Good() {
    }

    public Good(String name, String unit) {
        this.name = name;
        this.unit = unit;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Good name(String name) {
        setName(name);
        return this;
    }

    public Good unit(String unit) {
        setUnit(unit);
        return this;
    }

    public void input(String name) {

        this.name = name;
        System.out.print("Input unit: ");
        this.unit = scan.nextLine();
    }
}
