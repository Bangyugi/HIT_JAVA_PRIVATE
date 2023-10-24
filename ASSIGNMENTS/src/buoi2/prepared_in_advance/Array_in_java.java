package buoi2.prepared_in_advance;

import java.util.Scanner;

public class Array_in_java {

  public static void sieveOfEratosthenes(int isPrime[], int n) {
    for (int i = 0; i <= n; i++) {
      isPrime[i] = 1;
    }
    isPrime[0] = isPrime[1] = 0;
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (isPrime[i] == 1) {
        for (int j = i * i; j <= n; j+=i) {
          isPrime[j] = 0;
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Input n: ");
    int n = scan.nextInt();
    int isPrime[] = new int[10001];
    sieveOfEratosthenes(isPrime, n);
    System.out.println("List of prime numbers from 0 to n is: ");
    for (int i = 2; i <= n; i++) {
      if (isPrime[i] == 1) {
        System.out.print(i + " ");
      }
    }
    scan.close();
  }
}
