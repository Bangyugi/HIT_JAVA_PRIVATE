package buoi5.bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Customer> customers = new ArrayList<>();
    static ArrayList<Seller> sellers = new ArrayList<>();
    static ArrayList<Good> goods = new ArrayList<>();
    static ArrayList<InvoiceDetail> invoiceDetails = new ArrayList<>();
    static ArrayList<Invoice> invoices = new ArrayList<>();

    public static void case1(Scanner scan) {
        Invoice invoice = new Invoice();
        invoice.input(sellers, customers);
        invoices.add(invoice);
        System.out.println();
        System.out.print("Input the amount of goods: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            InvoiceDetail invoiceDetail = new InvoiceDetail();
            invoiceDetail.input(invoice, goods);
            invoiceDetails.add(invoiceDetail);
        }
        System.out.println();
    }

    public static void case2(Scanner scan) {
        for (Invoice invoice : invoices) {
            System.out.println(invoice.getCode());
        }
        System.out.print("Input invoice code: ");
        String code = scan.nextLine();
        for (Invoice invoice : invoices) {
            if (invoice.getCode().equals(code)) {
                invoice.output();
            }
        }

        for (InvoiceDetail invoiceDetail : invoiceDetails) {
            if (invoiceDetail.getInvoice().getCode().equals(code)) {
                invoiceDetail.output();
            }
        }
        System.out.println();
    }

    public static void case3() {
        for (Customer customer : customers) {
            customer.output();
        }
        System.out.println();
    }

    public static void case4() {
        for (Seller seller : sellers) {
            seller.output();
        }
        System.out.println();
    }

    public static void case5() {
        for (Good good : goods) {
            good.output();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("--- MENU ---");
        System.out.println("(1) Create an invoice ");
        System.out.println("(2) Open an invoice");
        System.out.println("(3) Show all customer");
        System.out.println("(4) Show all seller");
        System.out.println("(5) Show all goods");

        while (true) {
            System.out.print("Input your decision: ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {

                case 1: {
                    case1(scan);
                    break;
                }
                case 2: {
                    case2(scan);
                    break;
                }
                case 3: {
                    case3();
                    break;
                }
                case 4: {
                    case4();
                    break;
                }
                case 5: {
                    case5();
                    break;
                }
                case 6: {
                    break;
                }

                default:
                    break;
            }

        }

    }
}
