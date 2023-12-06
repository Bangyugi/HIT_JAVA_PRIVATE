package buoi7;

public abstract class Person {
    private String id;
    private String name;

    public Person() {
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person id(String id) {
        setId(id);
        return this;
    }

    public Person name(String name) {
        setName(name);
        return this;
    }

        
}
