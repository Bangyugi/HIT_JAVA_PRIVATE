package buoi5.codeError;

import java.util.ArrayList;
import java.util.Scanner;

public class Good_Invoice {
    String goodName;
    String invoiceCode;
    int quantity;
    int price;

    public Good_Invoice() {
    }

    public Good_Invoice(String goodName, String invoiceCode, int quantity, int price) {
        this.goodName = goodName;
        this.invoiceCode = invoiceCode;
        this.quantity = quantity;
        this.price = price;
    }

    Scanner scan = new Scanner(System.in);

    public String getGoodName() {
        return this.goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getInvoiceCode() {
        return this.invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void input(String code, ArrayList<Good> goods) {
        System.out.print("Input good's name: ");
        this.goodName = scan.nextLine();
        boolean check = false;
        for (Good good : goods) {
            if (good.getName().equals(goodName)) {
                check = true;
                break;
            }
        }
        if (check == false) {
            Good good = new Good();
            good.input(goodName);
            goods.add(good);
        }

        this.invoiceCode = code;
        System.out.print("Input quantity: ");
        this.quantity = scan.nextInt();
        System.out.print("Input price: ");
        this.price = scan.nextInt();
    }
}
