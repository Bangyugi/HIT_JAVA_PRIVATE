package buoi1;

import java.util.Scanner;

public class bai4 {

  public static void resultOfCalculation(long a, long b, char operator) {
    if (operator == '+') {
      System.out.println(a+b); 
    } else if (operator == '-'){
        System.out.println(a-b);
    }
    else if (operator == '*')
    {
        System.out.println(a*b); 
    }
    else if (operator == '/')
    {
        System.out.println((double)a/b); 
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long a = scan.nextLong();
    char operator = scan.next().charAt(0);
    long b = scan.nextLong();
    resultOfCalculation(a, b, operator);
    scan.close();
  }
}
