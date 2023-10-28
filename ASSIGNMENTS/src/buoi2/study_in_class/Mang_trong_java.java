package buoi2.study_in_class;

public class Mang_trong_java {

  public static void main(String[] args) {
    int[] array1 = new int[5];
    int[] array2 = { 5, 6, 7, 8, 9 };
    int a = array2[0];

    for (int i = array2.length - 1; i >= 0; i--) {
      System.out.print(array2[i] + " ");
    }
    System.out.println();

    for (int x : array2) {
      System.out.print(x + " ");
    }
  }
}
