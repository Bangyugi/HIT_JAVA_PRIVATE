package buoi6.assignments.bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MenuMain {
    public static void opiton1(List<Employee> list, Scanner scan) {

        while (true) {
            System.out.println("(1). Input partime employee");
            System.out.println("(2). Input fullime employee");
            System.out.println("(3). Back");
            System.out.print("Input your decision: ");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1: {
                    System.out.print("Input employee's name: ");
                    String name = scan.nextLine();
                    System.out.print("Input payment per hour: ");
                    int paymentPerHour = scan.nextInt();
                    System.out.print("Input employee's workinghours: ");
                    int workingHour = scan.nextInt();
                    scan.nextLine();
                    Employee partTimeEmployee = new PartTimeEmployee(name, paymentPerHour, workingHour);
                    list.add(partTimeEmployee);
                    break;
                }
                case 2: {

                    System.out.print("Input employee's name: ");
                    String name = scan.nextLine();
                    System.out.print("Input payment per hour: ");
                    int paymentPerHour = scan.nextInt();
                    scan.nextLine();
                    Employee fullTimeEmployee = new FullTimeEmployee(name, paymentPerHour);
                    list.add(fullTimeEmployee);
                    break;
                }
                case 3: {
                    return;
                }
            }
        }

    }

    public static void opiton2(List<Employee> list) {
        for (Employee employee : list) {
            employee.display();
        }
    }

    public static void option3(List<Employee> list) {
        Collections.sort(list, new Comparator<Employee>() {
            public int compare(Employee a, Employee b) {
                if (a.calculateSalary() - b.calculateSalary() > 0)
                    return -1;
                else
                    return 1;
            }
        });
    }

    public static void opiton4(List<Employee> list, Scanner scan) {
        int maxValueOfWorkingHours = 0;
        for (Employee employee : list) {
            if (employee.getWorkingHour() > maxValueOfWorkingHours) {
                maxValueOfWorkingHours = employee.getWorkingHour();
            }
        }
        for (Employee employee : list) {
            if (employee.getWorkingHour() == maxValueOfWorkingHours) {
                employee.display();
            }
        }

    }

    public static void option5(List<Employee> list) {
        int minValueOfWorkingHours = 1000000000;
        for (Employee employee : list) {

            if (employee.getWorkingHour() < minValueOfWorkingHours) {
                minValueOfWorkingHours = employee.getWorkingHour();
            }
        }
        List<Employee> temp = new ArrayList<>();
        for (Employee employee : list) {
            if (employee.getWorkingHour() == minValueOfWorkingHours) {
                temp.add(employee);
            }
        }
        list.removeAll(temp);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();
        while (true) {
            System.out.print("\n----------MENU----------\n");
            System.out.println("(1). Input employee:");
            System.out.println("(2). Show all employees");
            System.out.println("(3). Sort by salary");
            System.out.println("(4). Search for the most hard working employee");
            System.out.println("(5). Delete the layziest employee");
            System.out.println("(6). Exit");
            System.out.println("------------------------");
            System.out.print("Input your decision: ");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1: {
                    opiton1(list, scan);
                    break;
                }
                case 2: {
                    opiton2(list);
                    break;
                }
                case 3: {
                    option3(list);
                    break;
                }
                case 4: {
                    opiton4(list, scan);
                    break;
                }
                case 5: {
                    option5(list);
                    break;
                }
                case 6: {
                    System.out.println("Exited!");
                    scan.close();
                    return;
                }

                default:
                    break;
            }

        }
    }
}
