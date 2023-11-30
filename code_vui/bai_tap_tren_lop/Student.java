package code_vui.bai_tap_tren_lop;

public class Student extends Person {
    private String studentId;

    public Student() {
    }

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public Student(String name, int age, String address, String studentId) {
        super(name, age, address);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void study() {
        if (getAge() <= 26) {
            System.out.println("Sinh vien con di hoc");
        } else {
            System.out.println("Sinh vien da ra truong");
        }
    }

    public void output() {
        System.out.println("Student's ID: " + getStudentId() + "\nTen: " + getName() + "\nTuoi: " + getAge()
                + "\nDia chi:" + getAddress());
    }

}
