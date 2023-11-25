package buoi6.assignments.bai1;

public class Square extends Rectangle {

    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
    }

    public double getArea() {
        return getSide() * getSide();
    }

    public double getPerimeter() {
        return 4 * getSide();
    }

    @Override
    public String toString() {
        return "Square [side=" + getSide() + ", Area=" + Math.round(getArea() * 100.0) / 100.0 + ",Perimete="
                + Math.round(getPerimeter() * 100.0) / 100.0 + "]";
    }
}
