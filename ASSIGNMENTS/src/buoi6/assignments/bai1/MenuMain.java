package buoi6.assignments.bai1;

import java.util.Scanner;

public class MenuMain {

    public static void selection1(Scanner scan) {
        System.out.print("Input radius: ");
        double radius = scan.nextDouble();
        Circle circle = new Circle(radius);
        System.out.print("Is it filled?\t");
        boolean filled = scan.nextBoolean();
        scan.nextLine();
        circle.setFilled(filled);
        if (filled == true) {
            System.out.print("What color is it: ");
            String color = scan.nextLine();
            circle.setColor(color);

        } else {

        }
        System.out.println(circle.toString());
    }

    public static void selection2(Scanner scan) {
        System.out.print("Input width: ");
        double width = scan.nextDouble();
        System.out.print("Input length: ");
        double length = scan.nextDouble();
        Rectangle rectangle = new Rectangle(width, length);
        System.out.print("Is it filled?\t");
        boolean filled = scan.nextBoolean();
        scan.nextLine();
        rectangle.setFilled(filled);
        if (filled == true) {
            System.out.print("What color is it: ");
            String color = scan.nextLine();
            rectangle.setColor(color);

        } else {

        }
        System.out.println(rectangle.toString());
    }

    public static void selection3(Scanner scan) {
        System.out.print("Input side: ");
        double side = scan.nextDouble();
        Square square = new Square(side);
        System.out.print("Is it filled?\t");
        boolean filled = scan.nextBoolean();
        scan.nextLine();
        square.setFilled(filled);
        if (filled == true) {
            System.out.print("What color is it: ");
            String color = scan.nextLine();
            square.setColor(color);

        } else {

        }
        System.out.println(square.toString());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("\n--------------MENU--------------\n");
            System.out.println("(1). Circle");
            System.out.println("(2). Rectangle");
            System.out.println("(3). Square");

            System.out.print("Input your decision: ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1: {
                    selection1(scan);
                    break;
                }
                case 2: {
                    selection2(scan);
                    break;
                }
                case 3: {
                    selection3(scan);
                    break;
                }
                case 4: {

                }

                default:
                    break;
            }
        }
    }
}
