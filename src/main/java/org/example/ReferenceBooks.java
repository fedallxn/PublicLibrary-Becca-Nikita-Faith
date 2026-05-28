package org.example;

public class ReferenceBooks extends Books{
    public int editionNumber;

    public ReferenceBooks(String title, String author, int id, String description) {
        super(title, author, id, description);
        this.editionNumber = editionNumber;
    }
}
