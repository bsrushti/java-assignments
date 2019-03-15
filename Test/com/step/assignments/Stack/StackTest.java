package com.step.assignments.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack actualStack;
    private List<Integer> expectedStack;

    @BeforeEach
    void setUp() {
        actualStack = new Stack();
        expectedStack = new ArrayList<>();
    }

    @Test
    void shouldAddElementInTheBeginningOfStack() {
        actualStack.addElement(4);
        expectedStack.add(4);

        assertEquals(actualStack.getStack(),expectedStack);
    }
}