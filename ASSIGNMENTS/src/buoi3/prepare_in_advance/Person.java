package buoi3.prepare_in_advance;

public class Person {
    private String dateOfBirth;
    private String name;
    private String address;
    private String gender;

    @Override
    public String toString() {
        return "{" +
            " dateOfBirth='" + getDateOfBirth() + "'" +
            ", name='" + getName() + "'" +
            ", address='" + getAddress() + "'" +
            ", gender='" + getGender() + "'" +
            "}";
    }

    public Person() {
    }

    public Person(String name, String dateOfBirth, String address, String gender) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
