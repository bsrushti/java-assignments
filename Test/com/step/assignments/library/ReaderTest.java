package com.step.assignments.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.print.DocFlavor;

import static org.junit.jupiter.api.Assertions.*;

class ReaderTest {

    public static final String LET_US_C = "let us C";
    private Reader reader;
    private Book book;

    @BeforeEach
    void setUp() {
        reader = new Reader("Keerthy");
        book = new Book(LET_US_C);
    }

    @Test
    @DisplayName("should add book to the reader")
    void shouldBorrowBook() {
        reader.borrowBook(book);
        assertTrue(reader.getBorrowedBooks().contains(book));
    }

    @Test
    @DisplayName("should return true if given book is already borrowed by reader")
    void shouldReturnTrueIfBookIsAlreadyBorrowed() {
        reader.borrowBook(book);
        reader.hasBorrowed(book);
        assertTrue(reader.getBorrowedBooks().contains(book));
    }

    @Test
    @DisplayName("should return book to the library")
    void shouldReturnBookToLibrary() {
        reader.borrowBook(book);
        reader.returnBook(book);
        assertFalse(reader.getBorrowedBooks().contains(book));
    }
}