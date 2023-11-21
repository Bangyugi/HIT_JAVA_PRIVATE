package buoi5.bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceDetail {
    private Invoice invoice;
    private Good good;
    private int quantity;
    private int price;

    public InvoiceDetail() {
    }

    public InvoiceDetail(int quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public int getQuantity() {
        return quantity;
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
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

        System.out.print("Nhap ten hang hoa, dich vu: ");
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

        System.out.print("Nhap so luong hang hoa: ");
        this.quantity = scan.nextInt();
        System.out.print("Nhap gia cua moi hang hoa: ");
        this.price = scan.nextInt();
        scan.nextLine();

    }

    public int getTotal() {
        return getPrice() * getQuantity();
    }

    public void output() {
        good.output(1);
        System.out.printf("| %-10s | %-10s | %-20s |\n", getQuantity(), getPrice(), getTotal());
        // System.out.println("Quantity: " + getQuantity());
        // System.out.println("Price: " + getPrice());
    }
}
