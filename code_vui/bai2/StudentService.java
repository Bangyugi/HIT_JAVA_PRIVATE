package code_vui.bai2;

import java.util.ArrayList;

public interface StudentService {
    public void addStudent(ArrayList<Student> list);

    public void deleteStudent(ArrayList<Student> list);

    public void searchStudent(ArrayList<Student> list);

    public void sortedStudent(ArrayList<Student> list);

    public void showAllStudent(ArrayList<Student> list);
}
