package extra_assignment;

public class Employee extends Person {
    private String position;
    private String workingDate;

    public Employee() {
    }

    public Employee(String position, String workingDate) {
        this.position = position;
        this.workingDate = workingDate;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWorkingDate() {
        return this.workingDate;
    }

    public void setWorkingDate(String workingDate) {
        this.workingDate = workingDate;
    }
}
