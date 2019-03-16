package com.step.assignments.oop_part_1.polymorphism_excercise;

public class NonInteractiveWebPage implements Display, Printable {
    @Override
    public void diplayContent(String content) {
        System.out.println("Non-Interactive display");
    }

    @Override
    public String printContent() {
        return "Non-Interactive printable content";
    }
}
