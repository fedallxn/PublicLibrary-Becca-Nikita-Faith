package org.example;

import java.util.HashSet;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<Book> Library = new HashSet<>();

        FictionBook book1 = new FictionBook(
                "Harry Potter",
                "J.K Rowling",
                1,
                "A magical world of witches and wizards alike!",
                "Fantasy");
        FictionBook book2 = new FictionBook(
                "The Fifth Season",
                "N. K. Jemisn",
                2,
                "Multi POV Sci-fi fantasy novel about climate change!",
                "Sci-fi");
        FictionBook book3 = new FictionBook(
                "The Book of Doors",
                "Gareth Brown",
                3,
                "A women finds a book that leads here to anywhere she wishes to go!",
                "Fantasy");

        ReferenceBook book4 = new ReferenceBook(
                "National Geographic",
                "Robert Irwin",
                4,
                "How to handle yourself around crocodiles!",
                101);
        ReferenceBook book5 = new ReferenceBook(
                "The Body is Not an Apology",
                "Sonya Renee Taylor",
                5,
                "Breakdown ways we are at war with our bodies.",
                102);

        Library.add(book1);
        Library.add(book2);
        Library.add(book3);
        Library.add(book4);
        Library.add(book5);


    }
}