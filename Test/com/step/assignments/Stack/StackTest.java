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
    void shouldAddOneElementInTheBeginningOfStack() {
        actualStack.addElement(4);
        expectedStack.add(4);

        assertEquals(actualStack.getStack(),expectedStack);
    }

    @Test
    void shouldAddTwoElementInStack() {
        actualStack.addElement(4);
        actualStack.addElement(5);

        expectedStack.add(5);
        expectedStack.add(4);

        assertEquals(actualStack.getStack(),expectedStack);
    }

    @Test
    void shouldRemoveTopElementFromStack() {
        actualStack.addElement(4);
        actualStack.addElement(5);
        actualStack.removeElement();

        expectedStack.add(4);

        assertEquals(actualStack.getStack(),expectedStack);
    }

    @Test
    void shouldReturnTrueIfElementIsPresentInStack() {
        actualStack.addElement(4);
        actualStack.addElement(5);
        actualStack.addElement(2);

        assertTrue(actualStack.hasElement(5));
    }

    @Test
    void shouldReturnFalseIfElementIsPresentInStack() {
        actualStack.addElement(4);
        actualStack.addElement(5);
        actualStack.addElement(2);

        assertFalse(actualStack.hasElement(1));
    }
}