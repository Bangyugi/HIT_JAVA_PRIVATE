package buoi2.prepared_in_advance;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_in_java {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<Person> a = new ArrayList<Person>();
    while (true) {
      if (a.size() == 0) {
        System.out.println("Number of student in list: " + a.size());
        System.out.println("1. Add a student into list");
        System.out.println("2. End program");
        System.out.print("Input your choise: ");
        int choice = scan.nextInt();
        switch (choice) {
          case 1:
            {
              Person student = new Person();
              scan.nextLine();
              System.out.print("Input studen's name: ");
              student.name = scan.nextLine();
              System.out.print("Input student's ID: ");
              student.ID = scan.nextLine();
              System.out.print("Input student's age: ");
              student.age = scan.nextInt();
              a.add(student);
              break;
            }
          case 2:
            {
                scan.close();
              return;
            }
          default:
            continue;
        }
      } else {
        System.out.println("Number of student in list: " + a.size());
        System.out.println("1. Add a student into list");
        System.out.println("2. Remove a student out of list");
        System.out.println("3. Show all students in list");
        System.out.println("4. End program");
        System.out.print("Input your choise: ");
        int choice = scan.nextInt();
        switch (choice) {
          case 1:
            {
              Person student = new Person();
              scan.nextLine();
              System.out.print("Input studen's name: ");
              student.name = scan.nextLine();
              System.out.print("Input student's ID: ");
              
              student.ID = scan.nextLine();
              System.out.print("Input student's age: ");
              student.age = scan.nextInt();
              a.add(student);
              break;
            }
          case 2:
            {
              System.out.println("Input student who you want to remove: ");
              scan.nextLine();
              String name = scan.nextLine();
              for (int i = 0; i < a.size(); i++) {
                if (a.get(i).name.equals(name)) {
                  a.remove(i);
                  break;
                }
              }
              break;
            }
          case 3:
            {
              for (int i = 0; i < a.size(); i++) {
                System.out.println("Name: " + a.get(i).name);
                System.out.println("ID: " + a.get(i).ID);
                System.out.println("Age: " + a.get(i).age);
              }
              break;
            }
          case 4:
            {
                scan.close();
              return;
            }
          default:
            continue;
        }
      }
      System.out.println();
    }
  }
}
