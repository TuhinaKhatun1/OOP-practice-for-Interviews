package oops.project;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: Library Management System
 *
 * Concepts Used:
 * - Encapsulation
 * - Inheritance
 * - Polymorphism
 * - Object composition
 */

// Book class (Encapsulation)
class Book {
    private String title;
    private String author;
    private boolean isIssued;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println(title + " issued successfully");
        } else {
            System.out.println(title + " is already issued");
        }
    }

    public void returnBook() {
        isIssued = false;
        System.out.println(title + " returned successfully");
    }
}

// User class
class User {
    private String name;
    private List<Book> borrowedBooks = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void borrowBook(Book book) {
        if (!book.isIssued()) {
            borrowedBooks.add(book);
            book.issueBook();
        } else {
            System.out.println("Book not available");
        }
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.returnBook();
    }

    public String getName() {
        return name;
    }
}

// Library class
class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void showAvailableBooks() {
        for (Book b : books) {
            if (!b.isIssued()) {
                System.out.println("Available: " + b.getTitle());
            }
        }
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book("Java Basics", "Author A");
        Book b2 = new Book("DSA Guide", "Author B");

        library.addBook(b1);
        library.addBook(b2);

        User user = new User("Tuhina");

        library.showAvailableBooks();

        System.out.println("\n--- Borrowing Book ---");
        user.borrowBook(b1);

        System.out.println("\n--- Available Books ---");
        library.showAvailableBooks();

        System.out.println("\n--- Returning Book ---");
        user.returnBook(b1);

        System.out.println("\n--- Available Books ---");
        library.showAvailableBooks();
    }
}
