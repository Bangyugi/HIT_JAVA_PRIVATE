package code_vui.extra_assignment.bai2;

public class Employee extends Person {
    private String department;
    private int daysOfWork;

    public Employee() {
    }

    public Employee(String name, int age, String gender, String address, String phoneNumber, String department,
            int daysOfWork) {
        super(name, age, gender, address, phoneNumber);
        this.department = department;
        this.daysOfWork = daysOfWork;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getDaysOfWork() {
        return this.daysOfWork;
    }

    public void setDaysOfWork(int daysOfWork) {
        this.daysOfWork = daysOfWork;
    }

    public int salary() {
        if (this.daysOfWork > 25) {
            return 20 * 150000 + 5 * 200000 + (this.daysOfWork - 25) * 250000;
        } else if (this.daysOfWork > 20) {
            return 20 * 150000 + (this.daysOfWork - 20) * 200000;
        } else {
            return this.daysOfWork * 150000;
        }
    }

    public String toString(int retiredAge) {
        return super.toString() + "\n" +
                "Bo phan: " + getDepartment() + "\n" +
                "Ngay cong: " + getDaysOfWork() + "\n" +
                "Tuoi nghi huu: " + retiredAge + "\n" +
                "Luong: " + salary() + "\n";
    }
}
