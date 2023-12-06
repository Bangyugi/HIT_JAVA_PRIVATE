package buoi7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class University {
    List<Student> studentList = new ArrayList<>();
    List<Course> courseList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    
    public University(List<Student> studentList, List<Course> courseList) {
        this.studentList = studentList;
        this.courseList = courseList;
    }

    public University() {
    }

    public List<Student> getStudent() {
        return studentList;
    }

    public void addStudent() {
        Student student = new Student();
        student.input();
        studentList.add(student);
    }

    public List<Course> getCourse() {
        return courseList;
    }

    public void addCourse(List<Course> courseList, Course course) {
        courseList.add(course);
    }


    public void removeStudent(List<Student> studentList) {
        System.out.print("Input student's id whose you want to remove: ");
        String id = scan.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                studentList.remove(i);
            }
        }
    }

    public void removecourse(List<Course> courseList) {
        System.out.print("Input course's id whose you want to remove: ");
        String id = scan.nextLine();
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getCourseID().equals(id)) {
                courseList.remove(i);
            }
        }
    }

    public void enrollStudentInCourse(University university)
    {

    }
}
