package buoi1.assignments;

import java.util.Scanner;

public class Bai2 {

  public static void Translate(int n, int k) {
    if (n < k) {
      System.out.print(n);
    } else {
      Translate(n / k, k);
      int x = n % k;
      if (x >= 10) {
        x = x % 10 + 'A';
        System.out.println((char)x);
      } else {
        System.out.print(x);
      }
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    Translate(n, k);
    scan.close();
  }
}
