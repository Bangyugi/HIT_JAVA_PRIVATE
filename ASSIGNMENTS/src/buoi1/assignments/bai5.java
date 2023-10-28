package buoi1.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class bai5 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int arr[] = new int[5];
    for (int i = 0; i < 5; i++) {
      arr[i] = scan.nextInt();
    }
    Arrays.sort(arr);
    System.out.println(arr[3] + " " + arr[4]);
    scan.close();
  }
}
