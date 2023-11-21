package buoi5.codeError;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {
    String code;
    String date;
    String customerCode;
    String sellerCode;
    String paymentMethod;

    public Invoice(String code, String date, String customerCode, String sellerCode, String paymentMethod,
            ArrayList<Good_Invoice> list) {
        this.code = code;
        this.date = date;
        this.customerCode = customerCode;
        this.sellerCode = sellerCode;
        this.paymentMethod = paymentMethod;
        this.list = list;
    }

    public Invoice(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    ArrayList<Good_Invoice> list = new ArrayList<>();

    public Invoice() {
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerCode() {
        return this.customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getSellerCode() {
        return this.sellerCode;
    }

    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode;
    }

    public Invoice code(String code) {
        setCode(code);
        return this;
    }

    public Invoice date(String date) {
        setDate(date);
        return this;
    }

    public Invoice customerCode(String customerCode) {
        setCustomerCode(customerCode);
        return this;
    }

    public Invoice sellerCode(String sellerCode) {
        setSellerCode(sellerCode);
        return this;
    }

    Scanner scan = new Scanner(System.in);

    public void input(ArrayList<Seller> sellers, ArrayList<Customer> customers) {
        System.out.print("Input invoice's code: ");
        this.code = scan.nextLine();
        System.out.print("Input invoice's date: ");
        this.date = scan.nextLine();
        System.out.print("Input seller's code: ");
        this.sellerCode = scan.nextLine();
        boolean check = false;

        for (Seller seller : sellers) {
            if (seller.getCode().equals(sellerCode)) {
                check = true;
                break;
            }
        }

        if (check == false) {
            Seller seller = new Seller();
            seller.input(sellerCode);
            sellers.add(seller);
        }

        // System.out.print("Input customer's code: ");
        this.customerCode = scan.nextLine();
        check = false;

        for (Customer customer : customers) {
            if (customer.getCode().equals(customerCode)) {
                check = true;
                break;
            }
        }
        if (check == false) {
            Customer customer = new Customer();
            customer.input(customerCode);
            customers.add(customer);
        }

        System.out.print("Input payment method: ");
        this.paymentMethod = scan.nextLine();
    }

    public void input(ArrayList<Good> goods) {
        // System.out.print("Input the amount of goods: ");
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            Good_Invoice goodInvoice = new Good_Invoice();
            goodInvoice.input(getCode(), goods);

        }
    }

    public void output(ArrayList<Customer> customers, ArrayList<Seller> sellers) {
        System.out.println("Invoice code: " + getCode());
        System.out.println("Date: " + getDate());
        for (Seller seller : sellers) {
            if (seller.getCode().equals(sellerCode)) {
                seller.output();
            }
        }
        for (Customer customer : customers) {
            if (customer.getCode().equals(customerCode)) {
                customer.output();
            }
        }
        System.out.println("Payment method: " + paymentMethod);

        for (Good_Invoice good_Invoice : list) {

        }

    }

}
