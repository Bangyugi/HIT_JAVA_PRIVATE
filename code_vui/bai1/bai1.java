package code_vui.bai1;

import java.util.Scanner;
import java.util.Stack;

public class bai1 {

    static int cnt1 = 0;
    static int cnt2 = 0;
    static int cnt3 = 0;

    public static boolean check(String s) {
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        Stack<String> stack3 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                String c = "" + s.charAt(i);
                stack1.push(c);
                cnt1++;
            } else if (s.charAt(i) == '[') {
                stack2.push("" + s.charAt(i));
                cnt2++;
            } else if (s.charAt(i) == '{') {
                stack3.push("" + s.charAt(i));
                cnt3++;
            } else {
                if (s.charAt(i) == ')') {
                    if (stack1.empty()) {
                        return false;
                    } else {
                        stack1.pop();
                    }
                }
                if (s.charAt(i) == ']') {
                    if (stack2.empty()) {
                        return false;
                    } else {
                        stack2.pop();
                    }
                }
                if (s.charAt(i) == '}') {
                    if (stack3.empty()) {
                        return false;
                    } else {
                        stack3.pop();
                    }
                }

            }
        }
        if (stack1.empty() && stack2.empty() && stack3.empty()) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if (check(s)) {
            System.out.println("True");
            System.out.println("():" + cnt1);
            System.out.println("[]:" + cnt2);
            System.out.println("{}:" + cnt3);
        } else {
            System.out.println("False");
        }
        // System.out.println(s.charAt(0));
    }
}
