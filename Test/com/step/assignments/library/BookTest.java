package com.step.assignments.library;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    @DisplayName("should toggle isBorrowed")
    void shouldToggleIsBorrowedStatus() {
        Book let_us_c = new Book("let us c");
        assertFalse(let_us_c.getBorrowStatus());

        let_us_c.updateBorrow();
        assertTrue(let_us_c.getBorrowStatus());
    }
}