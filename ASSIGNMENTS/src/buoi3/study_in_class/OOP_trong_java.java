package buoi3.study_in_class;

import java.util.Scanner;

public class OOP_trong_java {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Sinhvien a = new Sinhvien("2022601111","Tran Van Bang");
    Sinhvien b = new Sinhvien(a);
    a.display();
    b.diHoc();
    
  }
}
