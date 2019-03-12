package com.step.assignments.oop_part_1.uno_assignment;

public class Main {

    public static void main(String[] args) {
        DuplicateUnoCard unoCard  = new UnoCard("red", 4);

        DuplicateUnoCard identityCard  = new IdentityCard("special card");

        String duplacateUnoCardColor = ((UnoCard) unoCard.duplicate()).getColor();
        int duplacateUnoCardNumber = ((UnoCard) unoCard.duplicate()).getNumber();
        System.out.println("Duplicate uno card of color "+ duplacateUnoCardColor+" with number "+duplacateUnoCardNumber);

        String duplicateIdentityCard = ((IdentityCard) identityCard.duplicate()).getType();
        System.out.println("Duplicate identity card is \""+ duplicateIdentityCard+"\" ");

    }
}
