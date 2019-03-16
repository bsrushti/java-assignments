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
        System.out.println("Pushed to the stack");
        System.out.println(this.stack);
    }

    public void removeElement() {
        this.stack.remove(0);
        System.out.println("Pop from the stack");
        System.out.println(this.stack);
    }

    public boolean hasElement(int element) {
        return this.stack.contains(element);
    }

    public void searchElement(int element) {
        String msg = "Element not found";
        if(hasElement(element)) {
            msg = "Element found "+element;
        }
        System.out.println(msg);
    }

    public void printMenu() {
        System.out.println("Enter your choice");
        System.out.println("1. push");
        System.out.println("2. pop");
        System.out.println("3. search");
        System.out.println("4. exit");
    }

}
