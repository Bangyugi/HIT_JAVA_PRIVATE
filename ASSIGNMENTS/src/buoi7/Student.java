package buoi7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student extends Person implements Displayable {
    private int age;
    private String grade;
    private List<Course> courses = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public Student(int age, String grade, List<Course> courses) {
        this.age = age;
        this.grade = grade;
        this.courses = courses;
    }

    public Student(String id, String name, int age, String grade, List<Course> courses) {
        super(id, name);
        this.age = age;
        this.grade = grade;
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Student() {
    }

    public Student(int age, String grade) {
        this.age = age;
        this.grade = grade;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Student age(int age) {
        setAge(age);
        return this;
    }

    public Student grade(String grade) {
        setGrade(grade);
        return this;
    }

    public void input() {

        System.out.print("Input student's id: ");
        String id = scan.nextLine();
        super.setId(id);
        System.out.print("Input student's name: ");
        String name = scan.nextLine();
        super.setName(name);
        System.out.print("Input student's age: ");
        int Age = scan.nextInt();
        scan.nextLine();
        setAge(Age);
        System.out.print("Input student's grade: ");
        String Grade = scan.nextLine();
        setGrade(Grade);
        

    }

    public void output() {
        System.out.println("---");
        System.out.println("ID: " + super.getId());
        System.out.println("Name: " + super.getName());
        System.out.println("Age: " + getAge());
        System.out.println("Grade: "+ getGrade());
    }

    public void enroll() {

    }

    public void displayInfo(University university) {

        for (Student student : university.getStudent()) {
            student.output();
        }
        if (courses.isEmpty() == true) {
            System.out.println("Empty...");
        } else

        {
            System.out.println("Courses was enrolled: ");
            for (Course course : courses) {
                course.output();
            }
        }
    }

}


