package buoi7;

import java.util.ArrayList;
import java.util.List;

public class Course implements Displayable {
    private String courseID;
    private String courseName;
    private List<Student> students = new ArrayList<>();

    public Course() {
    }
    public Course(String courseID, String courseName, List<Student> students) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.students = students;
    }
    public String getCourseID() {
        return courseID;
    }
    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public List<Student> getList() {
        return students;
    }

    public void setList(List<Student> students) {
        this.students = students;
    }
    
    public void output ()
    {
        System.out.println("Course's Id: " + getCourseID());
        System.out.println("Course's name: " + getCourseName());
    }

    public void displayInfo(University university)
    {

    }
}
