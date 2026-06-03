package org.example;

import java.util.HashSet;
import java.util.Scanner;

public class LibraryMenu {
    public Scanner scanner = new Scanner(System.in);
    public HashSet<Book> Library = new HashSet<>();

    public void mainMenu() {
        System.out.println("Welcome to the Library!");
        System.out.println("1. Add Book");
        System.out.println("2. Remove Book");
        System.out.println("3. View all Books");
        System.out.println("4. Exit");

        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            addBook();
        } else if (choice.equals("2")) {
            removeBook();
        } else if (choice.equals("3")) {
            viewLibrary();
        } else if (choice.equals("4")) {
            System.out.println("Goodbye!");
            System.exit(0);
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    public void addBook() {
        System.out.println("Enter book title: ");
        String bookTitle = scanner.nextLine();
        System.out.println("Enter author: ");
        String bookAuthor = scanner.nextLine();
        Book book = new Book(bookTitle, bookAuthor, Library.size() + 1, "unknown");

        Library.add(book);

        mainMenu();
    }

    public void removeBook() {
        System.out.println("Enter book ID: ");
        int bookID = scanner.nextInt();
        for (int i = 0; i < Library.size(); i++) {
            if (Library.contains(bookID) {
                Library.remove();
            }
        }
    }

    public void viewLibrary() {
    }
}
