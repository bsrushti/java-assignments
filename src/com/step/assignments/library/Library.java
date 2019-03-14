package com.step.assignments.library;

import java.util.*;

public class Library {

    private List<Book> books;
    private Map<Book, ArrayList<Reader> > borrowedBookRegister;
    private Map<Reader, ArrayList<Book> > readerRegister;

    public Library() {
        this.books = new ArrayList<>();
        this.borrowedBookRegister = new HashMap<>();
        this.readerRegister = new HashMap<>();
    }

    public void addBook(Book book) {
        books.add(book);
        borrowedBookRegister.put(book,new ArrayList<>());
    }

    public List<Book> getBooks() {
        return Collections.unmodifiableList(books);
    }

    public boolean hasBook(String bookName) {
        for (Book book: books){
            if(book.getName().equals(bookName)) return true;
        }
        return false;
    }

    public Map<Reader, ArrayList<Book>> getReaderRegister() {
        return readerRegister;
    }

    public void addReader(Reader reader) {
        readerRegister.put(reader, new ArrayList<>());
    }

    public Book findBook(String bookName) {
        for (Book book: books){
            if(book.getName().equals(bookName)) return book;
        }
        return null;
    }

    public void removeBookFromLibrary(Book book) {
        books.remove(book);
    }

    public void lendBook(String bookName, Reader reader) {
        Book book = findBook(bookName);
        ArrayList<Reader> readers = borrowedBookRegister.get(book);
        readers.add(reader);
        ArrayList<Book> availableBooks = readerRegister.get(reader);
        availableBooks.add(book);
        reader.borrowBook(book);
        book.updateBorrow();
    }
    
    public ArrayList<Reader> getReaderBy(Book book) {
        return borrowedBookRegister.get(book);
    }

    public List<Book> getBooksBy(Reader reader) {
        return readerRegister.get(reader);
    }

    public void returnBook(Book book, Reader reader) {
        book.updateBorrow();
        reader.returnBook(book);
        borrowedBookRegister.get(book).remove(reader);
        readerRegister.get(reader).remove(book);
    }

}
