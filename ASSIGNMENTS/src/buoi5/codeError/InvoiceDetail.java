package buoi5.codeError;

import java.util.Scanner;

public class InvoiceDetail {
    String invoiceCode;
    String customerCode;
    String paymentMethod;

    public InvoiceDetail() {
    }

    public InvoiceDetail(String invoiceCode, String customerCode, String paymentMethod) {
        this.invoiceCode = invoiceCode;
        this.customerCode = customerCode;
        this.paymentMethod = paymentMethod;
    }

    public String getInvoiceCode() {
        return this.invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public String getCustomerCode() {
        return this.customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public InvoiceDetail invoiceCode(String invoiceCode) {
        setInvoiceCode(invoiceCode);
        return this;
    }

    public InvoiceDetail customerCode(String customerCode) {
        setCustomerCode(customerCode);
        return this;
    }

    public InvoiceDetail paymentMethod(String paymentMethod) {
        setPaymentMethod(paymentMethod);
        return this;
    }

    Scanner scan = new Scanner(System.in);

    public void input(Invoice invoice) {

        this.invoiceCode = invoice.getCode();
        this.customerCode = invoice.getCustomerCode();

    }

}
