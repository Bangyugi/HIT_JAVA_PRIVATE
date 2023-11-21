package buoi5.bai2;

public class Seller extends Person {
    private String code;
    private String numberPhone;

    public Seller() {
    }

    public Seller(String code, String numberPhone) {
        this.code = code;
        this.numberPhone = numberPhone;
    }

    public Seller(String name, String address, String STK, String code, String numberPhone) {
        super(name, address, STK);
        this.code = code;
        this.numberPhone = numberPhone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void input(String code) {
        setCode(code);
        super.input();
        System.out.print("Input phone number: ");
        this.numberPhone = scan.nextLine();
    }

    public void output() {
        System.out.println("---\nSeller");
        System.out.println("Seller's code: " + getCode());
        super.output();
        System.out.println("Phone number: " + numberPhone);

    }

}
