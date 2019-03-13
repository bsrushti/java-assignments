package com.step.assignments.oop_part_1.hashset;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return " Person {\nname:"+name+"age:"+age+"}\n" ;
    }
}
