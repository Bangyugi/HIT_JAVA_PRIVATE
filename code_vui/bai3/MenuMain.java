package code_vui.bai3;

import java.util.Scanner;

public class MenuMain {
    static int listSize = 0;

    public static void inputCar(Vehicles list[], Scanner scan) {
        System.out.print("Input amount of vehicle: ");
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = listSize; i < listSize + n; i++) {
            Car car = new Car();
            car.input();
            list[i] = car;
        }
        listSize += n;
    }

    public static void inputTruck(Vehicles list[], Scanner scan) {
        System.out.print("Input amount of vehicle: ");
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = listSize; i < listSize + n; i++) {
            Truck truck = new Truck();
            truck.input();
            list[i] = truck;
        }
        listSize += n;
    }

    public static void outputCar(Vehicles list[]) {
        for (int i = 0; i <= listSize; i++) {
            if (list[i] instanceof Car) {
                Car car = (Car) list[i];
                car.display();
            }
        }
    }

    public static void outputTruck(Vehicles list[]) {
        for (int i = 0; i <= listSize; i++) {
            if (list[i] instanceof Truck) {
                Truck truck = (Truck) list[i];
                truck.display();
            }
        }
    }

    public static void price(Vehicles list[]) {
        for (int i = 0; i <= listSize; i++) {
            if (list[i] instanceof Car) {
                Car car = (Car) list[i];
                System.out.printf("Model: %-10s, Price: %-50s\n", car.getModel(), car.getPrice());

            }
            if (list[i] instanceof Truck) {
                Truck truck = (Truck) list[i];
                System.out.printf("Model: %-10s, Price: %-50s\n", truck.getModel(), truck.getPrice());
            }
        }
    }

    public static void dummyData(Vehicles list[])
    {
        Car car1 = new Car("Toyota", "Camry", 25000, "Blue");
        list[0] = car1;
        listSize++;

        Car car2 = new Car("Ford", "Mustang", 35000, "Red");
        list[1] = car2;
        listSize++;

        Truck truck1 = new Truck("Ford", "F-150", 35000, "2000 lbs");
        list[2] = truck1;
        listSize++;

        Truck truck2 = new Truck("GMC", "Sierra", 40000, "2800 lbs");
        list[3] = truck2;
        listSize++;

    }

    public static void main(String[] args) {
        Vehicles list[] = new Vehicles[10000];
        dummyData(list);
        while (true) {

            System.out.println("\n------- MENU -------");
            System.out.println("(1). Show car");
            System.out.println("(2). Show truck");
            System.out.println("(3). Show price");
            System.out.println("(4). Input car");
            System.out.println("(5). Input truck");
            System.out.println("(6). EXIT");
            System.out.println("------------------------");
            System.out.print("Input your decision: ");
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            scan.nextLine();
            System.out.println("So luong xe: "+ listSize);
            switch (choice) {
                case 1: {
                    outputCar(list);
                    break;
                }
                case 2: {
                    outputTruck(list);
                    break;
                }
                case 3: {
                    price(list);
                    break;
                }
                case 4: {
                    inputCar(list, scan);
                    break;
                }
                case 5: {
                    inputTruck(list, scan);
                    break;
                }
                case 6: {
                    scan.close();
                    return;
                }

                default:
                    break;
            }
        }
    }
}
