
import java.util.Scanner;

public class Lmao {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    char visited[] = new char[100001];
    int a[] = new int[5];
    for (int i = 0; i < 5;) {
      System.out.print("Nhap a[" + i + "]: ");
      int x = scan.nextInt();
      x = (char) (x + '0');
      if (visited[(char) x] == 0) {
        a[i] = x;
        visited[(char) x] = 1;
        i++;
      } else {
        System.out.println(x - '0' + " da duoc nhap truoc do!");
        System.out.print("Nhap lai: ");
      }
    }
    for (int x : a) {
      System.out.println((x - '0'));
    }
  }
}
