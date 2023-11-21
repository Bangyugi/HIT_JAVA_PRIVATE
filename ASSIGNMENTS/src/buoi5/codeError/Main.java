package buoi5.codeError;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Seller> sellers = new ArrayList<>();
    static ArrayList<Customer> customers = new ArrayList<>();
    static ArrayList<Invoice> invoices = new ArrayList<>();
    static ArrayList<Good_Invoice> goodInvoices = new ArrayList<>();
    static ArrayList<InvoiceDetail> invoiceDetails = new ArrayList<>();
    static ArrayList<Good> goods = new ArrayList<>();

    static InvoiceDetail invoiceDetail = new InvoiceDetail();

    static Good_Invoice goodInvoice = new Good_Invoice();

    public static void case1() {
        Invoice invoice = new Invoice();
        invoice.input(sellers, customers);
        invoice.input(goods);
        // goodInvoice.input(invoice, goods);
        invoices.add(invoice);
        // goodInvoices.add(goodInvoice);
    }

    public static void case2(Scanner scan) {
        for (Invoice invoice : invoices) {
            System.out.println(invoice.getCode());
        }
        System.out.print("Input invoice's code: ");
        String code = scan.nextLine();
        for (Invoice invoice : invoices) {
            if (invoice.getCode().equals(code)) {
                invoice.output(customers, sellers);
            }
        }
    }

    public static void main(String[] args) {
        // System.out.println(" HOA DON BAN HANG ");

        Scanner scan = new Scanner(System.in);
        System.out.println("\n------ Menu ------");
        System.out.println("1. New invoice");
        System.out.println("2. Open invoice");
        System.out.println("3. Show all customers");
        System.out.println("4. Show all sellers");
        System.out.println("5. Show all goods");
        System.out.println("6. Exit");

        while (true) {
            System.out.print("Input your choice: ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1: {
                    case1();
                    break;
                }
                case 2: {
                    case2(scan);
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    break;
                }
                case 6: {
                    scan.close();
                    System.out.println("Exited!");
                    return;
                }
                default: {
                    break;
                }

            }
        }

    }
}
