package com.step.assignments.oop_part_1.range_assignment;

import java.util.ArrayList;

public class NumberRange extends Range<Integer> {

private ArrayList<Integer> numbers;

    public NumberRange(Integer start, Integer end) {
        super(start, end);
        numbers = new ArrayList<Integer>(end-start);
    }

    @Override
    public ArrayList<Integer> getAll() {
        for (int i = super.start; i < super.end; i++) {
            this.numbers.add(i);
        }
        return this.numbers;
    }

    @Override
    public boolean contains(Integer value) {
        for(Integer number : numbers) {
            if(number == value) return true;
        }
        return false;
    }

    public void printRange(Integer[] numbers) {
        for(Integer number : numbers) {
            System.out.println(number);
        }
    }

}
