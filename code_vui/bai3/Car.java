package code_vui.bai3;

import java.util.Scanner;

public class Car extends Vehicles implements Class{
    private String color;

    public Car() {
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String maker, String model, int price, String color) {
        super(maker, model, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    Scanner scan = new Scanner(System.in);

    public void input() {
        System.out.print("Input car's maker: ");
        String Maker = scan.nextLine();
        setMaker(Maker);
        System.out.print("Input car's model: ");
        String Model = scan.nextLine();
        setModel(Model);
        System.out.print("Input car's price: ");
        int Price = scan.nextInt();
        scan.nextLine();
        setPrice(Price);
        System.out.print("Input car's color: ");
        String color = scan.nextLine();
        setColor(color);

    }

    public void display() {
        System.out.println("Marker: " + getMaker());
        System.out.println("Model: " + getModel());
        System.out.println("Price: " + getPrice());
        System.out.println("Color: "+ getColor());
    }
}
