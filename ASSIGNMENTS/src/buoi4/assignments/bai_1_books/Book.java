package buoi4.assignments.bai_1_books;

public class Book {
    private int ID = 0;
    private String bookName;
    private int releaseYear;
    private String type;
    private Author author;
    private static int count = 1;

    public Book() {
    }

    public Book(String bookName, int releaseYear, String type, Author author) {
        this.ID = count++;
        this.bookName = bookName;
        this.releaseYear = releaseYear;
        this.type = type;
        this.author = author;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void display() {
        System.out.printf("%-3s %-40s %-10s %-20s %-30s %-10s\n", ID, bookName, releaseYear, type,
                author.getAuthorName(), author.getBirthYear());
    }
}
