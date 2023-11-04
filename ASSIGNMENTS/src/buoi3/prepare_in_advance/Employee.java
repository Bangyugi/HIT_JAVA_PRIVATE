package buoi3.prepare_in_advance;

public class Employee extends Person {
    private String employeeName;
    private String hireDate;

    public Employee() {
        super();
    }

    public Employee(String name, String dateOfBirth, String address, String gender, String employeeName,
            String hireDate) {
        super(name, dateOfBirth, address, gender);
        this.employeeName = employeeName;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        // return "{" +
        //         " employeeName='" + getEmployeeName() + "'" +
        //         ", hireDate='" + getHireDate() + "'" +
        //         "}";
        return super.toString();
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getHireDate() {
        return this.hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

}
