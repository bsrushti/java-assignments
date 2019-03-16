package com.step.assignments.oop_part_1.polymorphism_excercise;

public class PDFPage implements Printable{

    @Override
    public String printContent() {
        return "Printing Content";
    }
}
