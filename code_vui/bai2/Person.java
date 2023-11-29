package code_vui.bai2;

public abstract class Person {
    private static int count = 1;
    private int id;
    private String name;
    private short age;
    private Address address;

    public Person() {
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person(String name, short age, Address address) {
        this.id = count++;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract String getCapacity(double score);

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address.toString() + "]";
    }
}
