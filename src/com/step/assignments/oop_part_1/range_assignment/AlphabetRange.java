package com.step.assignments.oop_part_1.range_assignment;

import java.util.ArrayList;

public class AlphabetRange extends Range<Character> {

    private ArrayList<Character> alphabets;

    public AlphabetRange(Character start, Character end) {
        super(start, end);
        System.out.println(start+" "+end);

    }

    @Override
    public ArrayList<Character> getAll() {
        for (int i = (int)super.start; i < (int)super.end; i++) {
            this.alphabets.add((char)i);
            System.out.println((char)i);
        }
        return this.alphabets;
    }

    @Override
    public boolean contains(Character value) {
        for(Character alphabet : alphabets) {
            if(alphabet.equals(value)) return true;
        }
        return false;
    }

    public void printRange(Character[] alphabets) {
        for(Character alphabet : alphabets) {
            System.out.println(alphabet);
        }
    }

}
