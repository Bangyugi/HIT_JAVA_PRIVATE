package buoi5.bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {
    private String code;
    private String date;
    private Customer customer;
    private Seller seller;
    private String paymentMethod;

    public Invoice() {
    }

    public Invoice(String code, String date, Customer customer, Seller seller, String paymentMethod) {
        this.code = code;
        this.date = date;
        this.customer = customer;
        this.seller = seller;
        this.paymentMethod = paymentMethod;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    Scanner scan = new Scanner(System.in);

    public void input(ArrayList<Seller> sellers, ArrayList<Customer> customers) {
        System.out.print("Input invoice's code: ");
        this.code = scan.nextLine();
        System.out.print("Input invoice's date: ");
        this.date = scan.nextLine();
        Seller seller = new Seller();
        Customer customer = new Customer();

        boolean check = false;
        System.out.print("Input seller code: ");
        String sellerCode = scan.nextLine();
        for (Seller x : sellers) {
            if (x.getCode().equals(sellerCode)) {
                check = true;
                seller = x;
                setSeller(seller);
                break;
            }
        }

        if (check == false) {
            seller.input(sellerCode);
            sellers.add(seller);
            setSeller(seller);
        }

        check = false;
        System.out.print("Input customer code: ");
        String customerCode = scan.nextLine();
        for (Customer x : customers) {
            if (x.getCode().equals(customerCode)) {
                check = true;
                customer = x;
                setCustomer(customer);
                break;
            }
        }

        if (check == false) {
            customer.input(customerCode);
            customers.add(customer);
            setCustomer(customer);
        }

        System.out.print("Input invoice's payment method: ");
        this.paymentMethod = scan.nextLine();
    }

    public void output() {
        System.out.println("Ma hoa don: " + getCode());
        System.out.println("Ngay lap: " + getDate());
        seller.output();
        customer.output();
        System.out.println("Hinh thuc thanh toan: " + getPaymentMethod());
    }

}
