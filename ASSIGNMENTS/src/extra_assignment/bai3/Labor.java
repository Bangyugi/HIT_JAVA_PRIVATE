package extra_assignment.bai3;

public class Labor {
    private String ID;
    private String name;
    private Integer daysOfWork;
    private final Integer price = 100000;

    public Labor() {
    }

    public Labor(String ID, String name, Integer daysOfWork) {
        this.ID = ID;
        this.name = name;
        this.daysOfWork = daysOfWork;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return this.name.toUpperCase();
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDaysOfWork() {
        return this.daysOfWork;
    }

    public void setDaysOfWork(Integer daysOfWork) {
        this.daysOfWork = daysOfWork;
    }

    public Integer getPrice() {
        return this.price;
    }

    public Integer getSalary() {
        if (this.daysOfWork >= 25) {
            return this.daysOfWork * getPrice() + 1000000;
        } else if (this.daysOfWork >= 15) {
            return this.daysOfWork * getPrice() + 700000;
        } else {
            return this.daysOfWork * getPrice();
        }
    }

    public void display() {
        System.out.printf("%-5s | %-20s | %-10s | %-15s | %-15s\n", getID(), getName(), getDaysOfWork(), getPrice(),
                getSalary());
    }

}
