package buoi6.assignments.bai2;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee() {

    }

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    public int calculateSalary() {
        return 8 * super.getPaymentPerHour();
    }

    public int getWorkingHour() {
        return 8;
    }

    public void display() {
        System.out.println("\n---FULLTIME EMPLOYEE---");
        System.out.println("Name: " + super.getName());
        System.out.println("Payment per hour: " + super.getPaymentPerHour());
    }
}
