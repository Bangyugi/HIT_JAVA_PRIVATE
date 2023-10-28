package buoi2.example_contest;

public class Bai2 {

  public static void main(String[] args) {
    String name = "Bang Tran Van Dep Trai";
    int character[] = new int[256];
    for (int i = 0; i < name.length(); i++) {
      character[name.charAt(i)] = 1;
    }
    for (int i = 0; i <= 255; i++) {
      if (character[i] != 0) {
        System.out.println((char) i);
      }
    }
  }
}
