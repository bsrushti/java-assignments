package com.step.assignments.oop_part_1.range_assignment;

public class Main {

    public static void main(String[] args) {

        Range<Integer> numberRange = new NumberRange(3,6);

        Integer[] numbers = numberRange.getAll().toArray(new Integer[0]);

        ((NumberRange) numberRange).printRange(numbers);
        System.out.println(numberRange.contains(3));


        Range<Character> alphabetRange = new AlphabetRange('a','g');

        Character []alphabets = alphabetRange.getAll().toArray(new Character[0]);
        System.out.println(alphabets);

        //((AlphabetRange) alphabetRange).printRange(alphabets);

    }
}
