package buoi3.assignment;

public class Vegetable {
    private String id;
    private String name;
    private String unit;
    private int quantitySold;
    private int sale;
    private double price;

    public Vegetable(String id, String name, String unit, int quantitySold, int sale, double price) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.quantitySold = quantitySold;
        this.sale = sale;
        this.price = price;
    }

    public double getTotalRevenue() {
        return quantitySold * (price - (price * sale) / 100);
    }

    public Vegetable() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getQuantitySold() {
        return this.quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public int getSale() {
        return this.sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;

    }

    void display() {

        System.out.printf("%-4s %-15s %-7s %-15s %-7s %-10s %-10s\n", this.id, this.name, this.unit,
                this.quantitySold,
                this.sale, String.format("%.0f", this.price), String.format("%.0f", this.getTotalRevenue()));

    }
}
