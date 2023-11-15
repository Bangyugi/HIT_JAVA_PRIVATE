package buoi4.assignments.bai_1_books;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai1_books_menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();

        // String bookName1 = "Problem solving 101";
        // int releaseYear1 = 2009;
        // String type1 = "self help";
        // String authorName1 = "Ken Watanabe";
        // int birthYear1 = 1982;
        // Author author1 = new Author(authorName1, birthYear1);
        // Book book1 = new Book(bookName1, releaseYear1, type1, author1);
        // list.add(book1);

        // String bookName2 = "How to win friend and influence people";
        // int releaseYear2 = 2010;
        // String type2 = "self help";
        // String authorName2 = "Dale Carnegie";
        // int birthYear2 = 1888;
        // Author author2 = new Author(authorName2, birthYear2);
        // Book book2 = new Book(bookName2, releaseYear2, type2, author2);
        // list.add(book2);

        // String bookName3 = "The Catcher in the Rye";
        // int releaseYear3 = 1951;
        // String type3 = "Fiction";
        // String authorName3 = "J.D. Salinger";
        // int birthYear3 = 1919;
        // Author author3 = new Author(authorName3, birthYear3);
        // Book book3 = new Book(bookName3, releaseYear3, type3, author3);
        // list.add(book3);

        // String bookName4 = "The Diary of a Young Girl";
        // int releaseYear4 = 1947;
        // String type4 = "Non-fiction";
        // String authorName4 = "Anne Frank";
        // int birthYear4 = 1929;
        // Author author4 = new Author(authorName4, birthYear4);
        // Book book4 = new Book(bookName4, releaseYear4, type4, author4);
        // list.add(book4);

        // String bookName5 = "The Hitchhiker's Guide to the Galaxy";
        // int releaseYear5 = 1979;
        // String type5 = "Science fiction";
        // String authorName5 = "Douglas Adams";
        // int birthYear5 = 1952;
        // Author author5 = new Author(authorName5, birthYear5);
        // Book book5 = new Book(bookName5, releaseYear5, type5, author5);
        // list.add(book5);

        // String bookName6 = "The Great Gatsby";
        // int releaseYear6 = 1925;
        // String type6 = "Fiction";
        // String authorName6 = "F. Scott Fitzgerald";
        // int birthYear6 = 1896;
        // Author author6 = new Author(authorName6, birthYear6);
        // Book book6 = new Book(bookName6, releaseYear6, type6, author6);
        // list.add(book6);

        while (true) {
            System.out.print("\n-------------------------------------\n");
            System.out.println(" (1) Input a new book into list");
            System.out.println(" (2) Show all the list");
            System.out.println(" (3) Find a book by name");
            System.out.println(" (4) Sort by author's name");
            System.out.print(" (5) EXIT");
            System.out.print("\n-------------------------------------\n");
            System.out.print("Input your choice: ");
            Integer choice = scan.nextInt();
            System.out.println();
            switch (choice) {
                case 1: {
                    System.out.print("Input amount of book:");
                    int n = scan.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Input book's name: ");
                        scan.nextLine();
                        String bookName = scan.nextLine();
                        System.out.print("Input year of publishing: ");
                        int releaseYear = scan.nextInt();
                        System.out.print("Input type of book: ");
                        scan.nextLine();
                        String type = scan.nextLine();
                        System.out.print("Input author's name: ");
                        String authorName = scan.nextLine();
                        System.out.print("Input author's year of birth: ");
                        int birthYear = scan.nextInt();
                        Author author = new Author(authorName, birthYear);
                        Book book = new Book(bookName, releaseYear, type, author);
                        list.add(book);
                    }

                    break;
                }
                case 2: {
                    System.out.printf("%-3s %-40s %-10s %-20s %-30s %-10s\n", "ID", "BookName", "Year", "Type",
                            "Author's name", "Author's birth year");
                    for (Book book : list) {
                        book.display();
                    }
                    break;
                }
                case 3: {
                    scan.nextLine();
                    System.out.print("Input searching keyword: ");
                    String word = scan.nextLine();
                    for (Book book : list) {
                        if (book.getBookName().contains(word)) {
                            book.display();
                        }
                    }
                    break;
                }
                case 4: {
                    Collections.sort(list, new Comparator<Book>() {
                        @Override
                        public int compare(Book b1, Book b2) {
                            return b1.getAuthor().getAuthorName().compareTo(b2.getAuthor().getAuthorName());
                        }
                    });
                    break;
                }

                case 5: {
                    System.out.println("Exited!");
                    scan.close();
                    return;
                }

                default:

            }
        }
    }
}
