package com.step.assignments.Stack;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    private List<Integer> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public List<Integer> getStack() {
        return stack;
    }

    public void addElement(int element) {
        this.stack.add(0,element);
    }

    public void removeElement() {
        this.stack.remove(0);
    }

    public boolean hasElement(int element) {
        return this.stack.contains(element);
    }
}
