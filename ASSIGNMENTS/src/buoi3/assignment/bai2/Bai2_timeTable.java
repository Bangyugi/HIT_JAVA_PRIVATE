
package buoi3.assignment.bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai2_timeTable {
    public static void main(String[] args) {
        ArrayList<Subject> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        // // ------------ EXAMPLE LIST INPUT ------------
        // Subject s1 = new Subject("1", "Androi dev", 15, "12:30", "14:20");
        // Subject s2 = new Subject("2", "Java back-end", 12, "14:30", "17:20");
        // Subject s3 = new Subject("3", "Database system", 14, "15:30", "17:20");
        // Subject s4 = new Subject("4", "Object-oriented programing", 17, "13:30",
        // "16:20");
        // Subject s5 = new Subject("5", "Basic programing", 20, "18:00", "20:00");
        // list.add(s1);
        // list.add(s2);
        // list.add(s3);
        // list.add(s4);
        // list.add(s5);
        while (true) {
            System.out.print("\n----------------------------------------\n");
            System.out.print("                    MENU                    ");
            System.out.print("\n----------------------------------------\n");
            System.out.println(" (1) Input a lesson");
            System.out.println(" (2) Show all list");
            System.out.println(" (3) Sort by finish time");
            System.out.println(" (4) How many lesson that i can join");
            System.out.print(" (5) EXIT");
            System.out.print("\n----------------------------------------\n");
            System.out.print("Input your choice: ");
            int choice = scan.nextInt();
            System.out.println();
            scan.nextLine();
            switch (choice) {
                case 1: {
                    System.out.print("Input ID: ");
                    String ID = scan.nextLine();
                    System.out.print("Input subject name: ");
                    String subjectName = scan.nextLine();
                    System.out.print("Input student count: ");
                    int sutdentCount = scan.nextInt();
                    System.out.print("Input time to start: ");
                    scan.nextLine();
                    String timeStart = scan.nextLine();
                    System.out.print("Input time to finish: ");
                    String timeEnd = scan.nextLine();
                    Subject subject = new Subject(ID, subjectName, sutdentCount, timeStart,
                            timeEnd);
                    list.add(subject);

                    break;
                }
                case 2: {
                    System.out.printf("%-4s %-30s %-20s %-20s \n", "Id", "Subject name", "Student count",
                            "Time start - end");
                    for (Subject subject : list) {
                        subject.display();
                    }
                    break;
                }
                case 3: {
                    Collections.sort(list, new sortByMinutes());
                    break;
                }
                case 4: {
                    ArrayList<Subject> temporarilyList = new ArrayList<>();
                    for (Subject subject : list) {
                        temporarilyList.add(subject);
                    }

                    Collections.sort(temporarilyList, new sortByMinutes());
                    System.out.print("Input time start time: ");
                    String start = scan.nextLine();
                    int startTime = Integer.parseInt(start.substring(0, 2)) * 60
                            + Integer.parseInt(start.substring(3, 5));

                    System.out.print("Input time finish time: ");
                    String end = scan.nextLine();
                    int temp = startTime;
                    int count = 0;
                    int endTime = Integer.parseInt(end.substring(0, 2)) * 60
                            + Integer.parseInt(end.substring(3, 5));

                    for (Subject subject : list) {
                        if (subject.getStartMinutes() >= temp && subject.getEndMinutes() <= endTime) {
                            temp = subject.getEndMinutes();
                            count++;
                        }
                    }
                    if (count > 1)
                        System.out.println("There is only " + count + "lesson you can join");
                    else
                        System.out.println("There are " + count + " lessons you can join");

                    temp = startTime;
                    for (Subject subject : list) {
                        if (subject.getStartMinutes() >= temp && subject.getEndMinutes() <= endTime) {
                            temp = subject.getEndMinutes();
                            subject.display();
                        }
                    }
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
