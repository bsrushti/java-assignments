package com.step.assignments.oop_part_1.range_assignment;

import java.util.ArrayList;

public abstract class Range<T> {

    T start;
    T end;

    public Range(T start, T end) {
        this.start = start;
        this.end = end;
    }

    public abstract ArrayList<T> getAll();
    public abstract boolean contains(T value);
}
