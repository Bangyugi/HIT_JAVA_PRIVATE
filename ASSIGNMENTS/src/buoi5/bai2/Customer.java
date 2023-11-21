package buoi5.bai2;

public class Customer extends Person {
    private String code;

    public Customer(String code) {
        this.code = code;
    }

    public Customer(String name, String address, String STK, String code) {
        super(name, address, STK);
        this.code = code;
    }

    public Customer() {
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Customer code(String code) {
        setCode(code);
        return this;
    }

    @Override
    public String toString() {
        return "Customer [code=" + code + "]";
    }

    public void input(String code) {
        setCode(code);
        super.input();
    }

    public void output() {
        System.out.println("---\nCustomer ");
        System.out.println("Customer's code: " + getCode());
        super.output();
    }

}
