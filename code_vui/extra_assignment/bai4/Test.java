package code_vui.extra_assignment.bai4;

import java.util.List;

public interface Test {
    public abstract void generateRandomStudents(int numberOfStudents, List<Student> students);

    public abstract void sortByName(List<Student> students);

    public abstract void searchingByName(List<Student> students);

    public abstract void danhSachLopHoc(List<Classroom> classrooms, List<Student> students);

    public abstract void soLuongThongKe(List<Classroom> classrooms);
}