package org.example;

public class FictionBooks extends Books{
    public String genre;

    public FictionBooks(String title, String author, int id, String description) {
        super(title, author, id, description);
        this.genre = genre;
    }
}
