package buoi4.assignments.bai2_computer_room;

import java.util.Scanner;

public class Bai2_computer_room {
    public static void main(String[] args) {
        ComputerRoom room = new ComputerRoom();
        Scanner scan = new Scanner(System.in);
        System.out.print("\n-------------------------------------\n");
        System.out.println(" (1) Input new information of a computer room");
        System.out.println(" (2) Show the information of latest input");
        System.out.println(" (3) Find a computer by computer type");
        System.out.println(" (4) Find a computer by computer id");
        System.out.print(" (5) EXIT");
        System.out.print("\n-------------------------------------\n");
        while (true) {
            System.out.print("Input your choice: ");
            Integer choice = scan.nextInt();
            System.out.println();

            switch (choice) {
                case 1: {
                    room.input();
                    break;
                }

                case 2: {
                    room.output();
                    break;
                }

                case 3: {
                    room.findByComputerType();
                    break;
                }
                case 4: {
                    room.findByComputerId();
                    break;
                }

                case 5: {
                    scan.close();
                    return;
                }

                default:
                    break;
            }
        }
    }
}
