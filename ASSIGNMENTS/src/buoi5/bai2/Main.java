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

    public static void option1(Scanner scan, String code) {

        System.out.println("\n---\n");

        System.out.println(
                "\n                                        HOA DON BAN HANG                                        \n");
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

    public static void option2(String code) {
        Good good = new Good();
        int max_value = 0;
        for (InvoiceDetail x : invoiceDetails) {
            if (x.getInvoice().getCode().equals(code)) {
                if (x.getQuantity() > max_value) {
                    good = x.getGood();
                    max_value = x.getQuantity();
                }
            }
        }
        good.output(2);

    }

    public static void case1(Scanner scan) {
        Invoice invoice = new Invoice();
        invoice.input(sellers, customers);
        invoices.add(invoice);
        System.out.println();
        System.out.print("Nhap so luong hang hoa: ");
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
        System.out.println("Cac hoa don da duoc luu: ");
        for (Invoice invoice : invoices) {
            System.out.println(invoice.getCode());
        }
        System.out.print("Nhap ma phieu muon mo: ");
        String code = scan.nextLine();

        boolean flag = true;
        while (flag) {
            System.out.println("(1). In ra phieu: ");
            System.out.println("(2). Tim thong tin san pham co so luong lon nhat: ");
            System.out.println("(3). Back");
            System.out.print("Nhap lua chon: ");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1: {
                    option1(scan, code);
                    break;
                }
                case 2: {
                    option2(code);
                    break;
                }
                case 3: {
                    flag = false;
                    break;
                }

                default:
                    break;
            }
        }
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

        while (true) {
            System.out.println("--- MENU ---");
            System.out.println("(1) Tao mot hoa don moi");
            System.out.println("(2) Mo mot hoa don");
            System.out.println("(3) In ra tat ca khach hang duoc luu");
            System.out.println("(4) In ra tat ca nguoi ban duoc luu");
            System.out.println("(5) In ra tat ca hang hoa duoc luu");
            System.out.print("Nhap lua chon: ");
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
                    scan.close();
                    System.out.println("Exited!");
                    return;
                }

                default:
                    break;
            }

        }

    }
}
