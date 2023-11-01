package buoi3.assignments_at_class;

import java.util.Scanner;

public class Tess_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Time currentTime = new Time();
        System.out.println("Input the current time: ");
        System.out.print("Input hour: ");
        int hour = scan.nextInt();
        System.out.print("Input minute: ");
        int minute = scan.nextInt();
        System.out.print("Input second: ");
        int second = scan.nextInt();

        currentTime.setTime(hour, minute, second);

        System.out.print("\nIt is: ");
        currentTime.display();

        currentTime.nextSecond();
        System.out.print("The time in next second is: ");
        currentTime.display();

        currentTime.previousSecond();
        currentTime.previousSecond();
        System.out.print("The time in previous second is: ");
        currentTime.display();

    }
}
