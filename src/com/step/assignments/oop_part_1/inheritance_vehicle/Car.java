package com.step.assignments.oop_part_1.inheritance;

public class Car extends Vehicle {

    private int gears;

    public Car(String color, int speed, int gears) {
        super(4, color, "Car", speed);
        this.gears = gears;
    }

    @Override
    public void increasingSpeed(int speed) {
        super.increasingSpeed(speed);
    }

    @Override
    public void decreasingSpeed(int speed) {
        super.decreasingSpeed(speed);
    }

    public void changingGears(int gear) {
        this.gears = gear;
        super.protectedMethod();
        System.out.println("Just chaged gear to "+this.gears);
    }
}
