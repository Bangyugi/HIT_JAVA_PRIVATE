package buoi6.assignments.bai1;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle radius(double radius) {
        setRadius(radius);
        return this;
    }

    public double getArea() {
        return 3.14 * getRadius() * getRadius();
    }

    public double getPerimeter() {
        return 2 * 3.14 * getRadius();
    }

    @Override
    public String toString() {
        return super.toString() + "Circle [radius=" + radius + ", Area=" + Math.round(getArea() * 100.0) / 100.0
                + ",Perimete="
                + Math.round(getPerimeter() * 100.0) / 100.0 + "]";
    }

}
