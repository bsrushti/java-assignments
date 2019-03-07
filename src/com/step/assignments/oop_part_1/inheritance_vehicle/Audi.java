package com.step.assignments.oop_part_1.inheritance;

public class Audi extends Car {
    public Audi(String color, int speed, int gears) {
        super(color, speed, gears);
    }

    @Override
    public void increasingSpeed(int speed) {
        super.increasingSpeed(speed);
    }

    @Override
    public void decreasingSpeed(int speed) {
        super.decreasingSpeed(speed);
    }

    @Override
    public void changingGears(int gears) {
        super.changingGears(gears);
    }
}
