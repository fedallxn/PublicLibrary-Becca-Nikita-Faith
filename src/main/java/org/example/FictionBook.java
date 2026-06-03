package org.example;

public class FictionBook extends Book{
    public String genre;

    public FictionBook(String title, String author, int id, String description, String genre) {
        super(title, author, id, description);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
