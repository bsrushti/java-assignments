package com.step.assignments.oop_part_1.polymorphism_excercise;

public class Console implements Display {

    @Override
    public void diplayContent(String content) {
        System.out.println(content);
    }
}
