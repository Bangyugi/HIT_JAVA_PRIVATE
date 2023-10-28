package buoi2.assignments;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String n  = scan.nextLine();
        n = n.toLowerCase();
        
        char[] a = new char[256];
        for (int i = 0; i < n.length(); i++) {
            a[n.charAt(i)] = 1;
        }
        for (int i = 'a'; i <= 'z'; i++) {
            if (a[i] == 0)
            {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        return;


    }
}
