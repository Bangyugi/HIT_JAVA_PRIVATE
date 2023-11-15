package buoi4.assignments.bai_1_books;

public class Author {
    private String authorName;
    private int birthYear;

    public Author() {
    }

    public Author(String authorName, int birthYear) {
        this.authorName = authorName;
        this.birthYear = birthYear;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
