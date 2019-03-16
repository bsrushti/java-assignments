package com.step.assignments.library;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        Library.Librarian librarian = library.getLibrarian();

        Book atomicHabits = new Book("Atomic Habits");
        Book kiteRunner = new Book("Kite Runner");
        Book powerOfHabits = new Book("Power of habits");

        librarian.addBook(atomicHabits);
        librarian.addBook(kiteRunner);
        librarian.addBook(powerOfHabits);

        librarian.getBookNames();

        Reader rahul = new Reader("Rahul");
        librarian.addReader(rahul);
        librarian.lendBook("Atomic Habits",rahul);
        List<Book> rahulBooks = librarian.getBooksBy(rahul);

        System.out.println("\nBooks borrowed by Rahul are : ");
        librarian.printBorrowedBooksOfReader(rahul);
    }
}
