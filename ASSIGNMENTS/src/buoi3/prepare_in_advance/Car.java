package buoi3.prepare_in_advance;

public class Car {
    String name;
    String ID;
    int year;
    double price;
    String brand;

    public Car() {
    }

    public Car(String name, String ID, int year, double price, String brand) {
        this.name = name;
        this.name = this.name.toUpperCase();
        this.ID = ID;
        this.year = year;
        if (price < 0)
            this.price = 0;
        else
            this.price = price;
        this.brand = brand;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
