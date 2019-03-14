package com.step.assignments.library;

public class Book {
    private String name;
    private boolean isBorrowed;

    public Book(String name) {
        this.name = name;
        this.isBorrowed = false;
    }

    public String getName() {
        return name;
    }

    public void updateBorrow() {
        this.isBorrowed = !this.isBorrowed;
    }

    public boolean getBorrowStatus() {
        return this.isBorrowed;
    }
}
