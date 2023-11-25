package buoi6.assignments.bai1;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return getLength() * getWidth();
    }

    public double getPerimeter() {
        return (getLength() + getWidth()) * 2;
    }

    @Override
    public String toString() {
        return super.toString() + "Rectangle [width=" + width + ", length=" + length + ", Area="
                + Math.round(getArea() * 100.0) / 100.0
                + ",Perimete="
                + Math.round(getPerimeter() * 100.0) / 100.0 + "]";
    }

}
