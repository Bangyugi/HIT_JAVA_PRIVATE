package buoi2.assignments;

import java.util.Scanner;

public class Bai3 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String n = scan.nextLine();
    int chars = 0;
    int digits = 0;
    int other = 0;
    for (int i = 0; i < n.length(); i++) {
      if (Character.isDigit(n.charAt(i))) digits++; else if (
        Character.isLetter(n.charAt(i))
      ) chars++; else other++;
    }
    System.out.println(chars + " " + digits + " " + other);
    scan.close();
  }
}
