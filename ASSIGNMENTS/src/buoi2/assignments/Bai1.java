package buoi2.assignments;

import java.util.Scanner;

public class Bai1 {

  public static void main(String[] args) {
    int[] check = new int[1000001];
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int maxValue = 0;
    int maxIndex = 0;
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = scan.nextInt();
      check[a[i]]++;
    }
    for (int i = 0; i < check.length; i++) {
        if (check[i]>maxValue)
      {
        maxIndex=i;
        maxValue=check[i];
      }
    }
    System.out.println(maxIndex + " " + maxValue);
    scan.close();
  }
}
