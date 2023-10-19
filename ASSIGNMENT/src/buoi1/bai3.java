package buoi1;

import java.util.Scanner;

public class bai3 {

  public static long sumOfDigits(long n) {
    long answer = 1;
    while (n > 0) {
      answer *= n % 10;
      n /= 10;
    }
    return answer;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    System.out.println(sumOfDigits(n));
    scan.close();
  }
}
