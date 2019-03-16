package com.step.assignments.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    public static final String LET_US_C = "let us C";
    public static final String ANOTHER_BOOK = "Another book";
    private Library library;
    private Book book;
    private Reader reader;
    private Library.Librarian librarian;

    @BeforeEach
    void setUp() {
        library = new Library();
        librarian = library.new Librarian();
        book = new Book(LET_US_C);
        librarian.addBook(book);
        reader = new Reader("Keerthy");
        librarian.addReader(reader);
    }

    @Test
    @DisplayName("should add book in library")
    void shouldAddBookInLibrary() {
        assertTrue(librarian.getBooks().contains(book));
        assertTrue(librarian.getBorrowedBookRegister().containsKey(book));
    }

    @Test
    @DisplayName("should return true if given book is present in library")
    void shouldReturnTrueIfBookIsPresent() {
        assertTrue(librarian.hasBook(LET_US_C));
    }

    @Test
    @DisplayName("should return false if given book is present in library")
    void shouldReturnFalseIfBookIsPresent() {
        assertFalse(librarian.hasBook(ANOTHER_BOOK));
    }

    @Test
    @DisplayName("should add reader to reader and borrowed books to readerRegister")
    void shouldAddReader() {
        assertTrue(librarian.getReaderRegister().containsKey(reader));
    }

    @Test
    @DisplayName("should Lend Book To Reader")
    void shouldLendBookToReader() {
        librarian.lendBook(LET_US_C, reader);

        assertTrue(book.getBorrowStatus());
        assertTrue(reader.getBorrowedBooks().contains(book));
    }

    @Test
    @DisplayName("should return book if book present in library")
    void shouldReturnBookIfBookIsPresent() {
        assertEquals(librarian.findBook(LET_US_C), book);
    }

    @Test
    @DisplayName("should return book if book present in library")
    void shouldReturnNullIfBookIsNotPresent() {
        Book book = librarian.findBook("C++");

        assertEquals(book, null);
    }

    @Test
    @DisplayName("should remove given book from library")
    void shouldRemoveBorrowedBookFromLibrary() {
        librarian.removeBookFromLibrary(book);

        assertFalse(librarian.hasBook(LET_US_C));
    }

    @Test
    @DisplayName("should return book borrower")
    void shouldReturnReaderByProvidedBook() {
        librarian.lendBook(LET_US_C, reader);
        ArrayList<Reader> readers = new ArrayList<>();
        readers.add(reader);

        assertEquals(librarian.getReaderBy(book), readers);
    }

    @Test
    @DisplayName("should return list of books the reader has")
    void shouldReturnListOfBooksOfReader() {
        librarian.lendBook(LET_US_C, reader);
        List<Book> books = librarian.getBooksBy(reader);
        List<Book> expectedOutput = new ArrayList<>();
        expectedOutput.add(book);

        assertEquals(books, expectedOutput);
    }

    @Test
    @DisplayName("should update library books when reader returns book to library")
    void shouldReturnBookToLibrary() {
        librarian.lendBook(LET_US_C, reader);
        librarian.returnBook(book,reader);

        assertFalse(book.getBorrowStatus());
        assertTrue(librarian.hasBook(LET_US_C));
        assertFalse(librarian.getBooksBy(reader).contains(book));
        assertFalse(librarian.getReaderBy(book).contains(reader));
    }

}

