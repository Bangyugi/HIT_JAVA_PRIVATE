package code_vui.bai_tap_tren_lop;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person() {
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person name(String name) {
        setName(name);
        return this;
    }

    public Person age(int age) {
        setAge(age);
        return this;
    }

    public Person address(String address) {
        setAddress(address);
        return this;
    }

}
