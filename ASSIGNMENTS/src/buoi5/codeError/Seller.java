package buoi5.codeError;

import java.util.Scanner;

public class Seller extends Person {
    private String code;
    private String SDT;

    public Seller() {
    }

    public Seller(String code, String sDT) {
        this.code = code;
        SDT = sDT;
    }

    public Seller(String name, String address, String sTK, String code, String sDT) {
        super(name, address, sTK);
        this.code = code;
        SDT = sDT;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String sDT) {
        SDT = sDT;
    }

    Scanner scan = new Scanner(System.in);

    public void input(String code) {
        super.input();
        setCode(code);
        System.out.print("Input phone number: ");
        this.SDT = scan.nextLine();
    }

    public void output() {
        System.out.println("Seller's code: " + getCode());
        super.output();
        System.out.println("SDT: " + getSDT());
    }
}
