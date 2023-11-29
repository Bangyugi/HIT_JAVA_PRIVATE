package code_vui.bai2;

public class Student extends Person {
    private double score;

    public Student() {
    }

    public Student(double score) {
        this.score = score;
    }

    public Student(String name, short age, Address address, double score) {
        super(name, age, address);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getCapacity(double score) {
        if (score >= 9.0) {
            return "Hoc luc xuat sac";
        } else if (score >= 8.0) {
            return "Hoc luc gioi";
        } else if (score >= 6.5) {
            return "Hoc luc kha";
        } else {
            return "Hoc luc trung binh yeu";
        }

    }

    @Override
    public String toString() {
        return super.toString() + "Student [score=" + score + "]" + getCapacity(score);
    }

}
