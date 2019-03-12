package com.step.assignments.oop_part_1.uno_assignment;

public class IdentityCard implements DuplicateUnoCard {

    private String type;


    public IdentityCard(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public Object duplicate() {
        return new IdentityCard(this.type);
    }
}
