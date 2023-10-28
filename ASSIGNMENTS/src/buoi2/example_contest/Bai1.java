package buoi2.example_contest;

public class Bai1 {

  public static void main(String[] args) {
    int a[] = { 1, 2, 3, 2, 4, 3, 2, 1, 2 };
    int fre[] = new int[10001];
    for (int i = 0; i < a.length; i++) {
      fre[a[i]]++;
    }
    int maxValue = 0;
    int maxFrequent = 0;
    for (int i = 0; i < 4; i++) {
      if (maxFrequent < fre[i]) {
        maxValue = i ;
        maxFrequent = fre[i];
      }
    }
    System.out.println(maxValue + " " + maxFrequent);
  }
}
