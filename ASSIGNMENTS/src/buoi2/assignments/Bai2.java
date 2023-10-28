package buoi2.assignments;

import java.util.Scanner;

public class Bai2 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] a = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      a[i] = scan.nextInt();
    }
    for (int i = 1; i <= n; i++) {
      a[i] += a[i - 1];
    }
    int q = scan.nextInt();
    for (int i = 0; i < q; i++) {
      int l = scan.nextInt();
      int r = scan.nextInt();
      System.out.println(a[r]-a[l-1]);
    }
    scan.close();
  }
}
