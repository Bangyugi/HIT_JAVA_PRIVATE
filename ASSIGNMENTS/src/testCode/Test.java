public class Test {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();

        Person[] arr = { e, m };

        // for (Person person : arr) {
        // person.input();
        // }
        e.input();
    }
}
