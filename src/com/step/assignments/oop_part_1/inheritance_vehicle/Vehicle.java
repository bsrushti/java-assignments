package com.step.assignments.oop_part_1.inheritance;

public class Vehicle {
    private int wheels;
    private String color;
    private String type;
    private int speed;

    public Vehicle(int wheels, String color, String type, int speed) {
        this.wheels = wheels;
        this.color = color;
        this.type = type;
        this.speed = speed;
    }

    public void increasingSpeed(int speed) {
        this.speed += speed;
        System.out.println("Increasing speed... "+this.speed);
    }

    public void decreasingSpeed(int speed) {
        this.speed -= speed;
        System.out.println("Decreasing speed... "+this.speed);
    }

    protected void protectedMethod() {
        System.out.println("protected method");
    }
}
//    Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.