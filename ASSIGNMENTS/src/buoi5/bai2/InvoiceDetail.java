package buoi5.bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceDetail {
    private Invoice invoice;
    private static Good good;
    private int quantity;
    private int price;

    public InvoiceDetail() {
    }

    public InvoiceDetail(int quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }

    public static Good getGood() {
        return good;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public static void setGood(Good good) {
        InvoiceDetail.good = good;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    Scanner scan = new Scanner(System.in);

    public void input(Invoice invoice, ArrayList<Good> goods) {
        setInvoice(invoice);

        System.out.print("Input good's name: ");
        String name = scan.nextLine();
        Good good = new Good();
        boolean check = false;
        for (Good x : goods) {
            if (x.getName().equals(name)) {
                check = true;
                good = x;
                setGood(good);
                break;
            }
        }
        if (check == false) {
            good.intput(name);
            goods.add(good);
            setGood(good);
        }

        System.out.print("Input quantity: ");
        this.quantity = scan.nextInt();
        System.out.print("Input price: ");
        this.price = scan.nextInt();
        scan.nextLine();

    }

    public void output() {
        good.output();
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Price: " + getPrice());
    }
}
