package org.example;

public class ReferenceBook extends Book{
    public int editionNumber;

    public ReferenceBook(String title, String author, int id, String description, int editionNumber) {
        super(title, author, id, description);
        this.editionNumber = editionNumber;
    }

    public int getEditionNumber() {
        return editionNumber;
    }

    public void setEditionNumber(int editionNumber) {
        this.editionNumber = editionNumber;
    }
}
