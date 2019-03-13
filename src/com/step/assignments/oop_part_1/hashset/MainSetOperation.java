package com.step.assignments.oop_part_1.hashset;

import java.util.HashSet;

public class MainSetOperation {

    public static void main(String[] args) {

        HashSet set1 = new HashSet();

        set1.add(2);
        set1.add(4);
        set1.add(6);
        set1.add(1);


        HashSet set2 = new HashSet();

        set2.add(5);
        set2.add(2);
        set2.add(1);
        set2.add(6);

        SetOperation setOperation = new SetOperation(set1, set2);

        System.out.println(setOperation.getUnion());
        System.out.println(setOperation.getIntersection());
        System.out.println(setOperation.getDifference());

    }
}
