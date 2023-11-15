package buoi4.study_in_class;

public class SinhVien {
    private int id;
    private String name;
    private static int count = 1;

    public SinhVien(String name) {
        this.id = count++;
        this.name = name;
    }

    public SinhVien() {
        count++;
        this.id = count;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Sinh vien: ID = " + this.id + ", Name = " + this.name;
    }
}
