package com.step.assignments.oop_part_1.uno_assignment;

public class UnoCard implements DuplicateUnoCard {

    private String color;
    private int number;

    public UnoCard(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public Object duplicate() {
        return new UnoCard(this.color,this.number);
    }
}
