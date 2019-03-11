package com.step.assignments.oop_part_1.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>(5);
        integers.add(2);
        integers.add(3);
        integers.add(5);
        integers.add(12);

        ListIterator listIterator = new ListIterator(integers);

        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());

    }
}
