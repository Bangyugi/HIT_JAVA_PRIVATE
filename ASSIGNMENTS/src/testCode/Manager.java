import java.util.Date;

public class Manager extends Employee {
    Employee assistant;

    public Manager(String name, String birthday, double salary, Employee assistant) {
        super(name, birthday, salary);
        this.assistant = assistant;
    }

    public Manager(double salary, Employee assistant) {
        super(salary);
        this.assistant = assistant;
    }

    public Manager() {

    }

    public Manager(Employee assistant) {
        this.assistant = assistant;
    }

    public Employee getAssistant() {
        return this.assistant;
    }

    public void setAssistant(Employee assistant) {
        this.assistant = assistant;
    }

}
