package buoi5.codeError;

import java.util.Scanner;

public class Customer extends Person {
    String code;

    public Customer() {
    }

    public Customer(String code) {
        this.code = code;
    }

    public Customer(String name, String address, String sTK, String code) {
        super(name, address, sTK);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    Scanner scan = new Scanner(System.in);

    public void input(String code) {
        super.input();
        setCode(code);
    }

    public void output() {
        System.out.println("Customer's code: " + getCode());
        super.output();
    }

}
