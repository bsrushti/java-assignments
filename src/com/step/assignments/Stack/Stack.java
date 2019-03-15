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

}
