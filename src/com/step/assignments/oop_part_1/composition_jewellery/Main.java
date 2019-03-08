package com.step.assignments.oop_part_1.composition_jewellery;

public class Main {
    public static void main(String[] args) {

        JewelleryBox smallestJewelleryBox = new JewelleryBox();

        Jewellery jewelleryInBiggest = new Jewellery("gold");
        JewelleryBox smallerBox = new JewelleryBox(jewelleryInBiggest, smallestJewelleryBox);

        JewelleryBox biggestBox = new JewelleryBox(jewelleryInBiggest, smallerBox);

        System.out.println(biggestBox.totalJewelleries());
    }
}
