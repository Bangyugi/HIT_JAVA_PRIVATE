package code_vui.bai3;

import java.util.Scanner;

public class Truck extends Vehicles implements Class{
    private String truckLoad;

    public Truck() {
    }

    public Truck(String truckLoad) {
        this.truckLoad = truckLoad;
    }

    public Truck(String maker, String model, int price, String truckLoad) {
        super(maker, model, price);
        this.truckLoad = truckLoad;
    }

    public String getTruckLoad() {
        return truckLoad;
    }

    public void setTruckLoad(String truckLoad) {
        this.truckLoad = truckLoad;
    }
 
    Scanner scan = new Scanner(System.in);
    public void input() {
        System.out.print("Input truck's maker: ");
        String Maker = scan.nextLine();
        setMaker(Maker);
        System.out.print("Input truck's model: ");
        String Model = scan.nextLine();
        setModel(Model);
        System.out.print("Input truck's price: ");
        int Price = scan.nextInt();
        scan.nextLine();
        setPrice(Price);
        System.out.print("Input truck's truckload: ");
        String Truckload = scan.nextLine();
        setTruckLoad(Truckload);
    }

    public void display() {
        System.out.println("Marker: " + getMaker());
        System.out.println("Model: " + getModel());
        System.out.println("Price: " + getPrice());
        System.out.println("Truck load: "+ getTruckLoad());
    }
}
