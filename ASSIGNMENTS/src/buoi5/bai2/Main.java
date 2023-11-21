package buoi5.bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        Collections.sort(invoiceDetails, new Comparator<InvoiceDetail>() {
            public int compare(InvoiceDetail a, InvoiceDetail b) {
                if (a.getPrice() - b.getPrice() < 0)
                    return 1;
                return -1;
            }
        });
        for (Invoice invoice : invoices) {
            System.out.println(invoice.getCode());
        }
        System.out.print("Input invoice code: ");
        String code = scan.nextLine();

        System.out.println("\n                               HOA DON BAN HANG                               \n");
        System.out.println();
        for (Invoice invoice : invoices) {
            if (invoice.getCode().equals(code)) {
                invoice.output();
            }
        }
        System.out.println(
                "------------------------------------------------------------------------------------------------");
        System.out.printf("| %-25s | %-15s | %-10s | %-10s | %-20s |\n", "Ten hang hoa, dich vu", "Don vi tinh",
                "So luong", "Don gia", "Thanh Tien");
        System.out.println(
                "------------------------------------------------------------------------------------------------");
        for (InvoiceDetail invoiceDetail : invoiceDetails) {
            if (invoiceDetail.getInvoice().getCode().equals(code)) {
                invoiceDetail.output();
            }
        }
        System.out.println(
                "------------------------------------------------------------------------------------------------");
        int addUP = 0;
        for (InvoiceDetail invoiceDetail : invoiceDetails) {
            if (invoiceDetail.getInvoice().getCode().equals(code)) {
                addUP += invoiceDetail.getTotal();
            }
        }
        System.out.println("Tong tien can thanh toan: " + addUP);
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
            good.output(2);
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
