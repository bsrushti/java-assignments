package com.step.assignments.oop_part_1.hashset;

import java.util.HashSet;


public class MainSet {

    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        people.add(new Person("srushti",18));
        people.add(new Person("suman",20));
        people.add(new Person("rishab",21));
        people.add(new Person("arnab",21));
        people.add(new Person("swagata",21));
        people.add(new Person("gayatri",19));

        System.out.println(people.toString());

    }
}
