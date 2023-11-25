package buoi6.assignments.bai2;

public class PartTimeEmployee extends Employee {
    private int workingHour;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(int workingHour) {
        this.workingHour = workingHour;
    }

    public PartTimeEmployee(String name, int paymentPerHour, int workingHour) {
        super(name, paymentPerHour);
        this.workingHour = workingHour;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public int calculateSalary() {
        return this.workingHour * super.getPaymentPerHour();
    }

    public void display() {
        System.out.println("\n---PARTIME EMPLOYEE---");
        System.out.println("Name: " + super.getName());
        System.out.println("Payment per hour: " + super.getPaymentPerHour());
        System.out.println("Working hours: " + getWorkingHour());
    }
}
