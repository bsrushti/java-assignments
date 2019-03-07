package com.step.assignments.oop_part_1.inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------Vehicle--------");
        Vehicle vehicle = new Vehicle(4,"red","Car",200);
        vehicle.decreasingSpeed(20);
        vehicle.increasingSpeed(10);

        System.out.println("---------Car--------");
        Car car = new Car("Red",200,4);
        car.changingGears(2);
        car.decreasingSpeed(10);
        car.increasingSpeed(20);

        System.out.println("---------Audi--------");
        Audi audi = new Audi("Red", 200, 4);
        audi.changingGears(3);
        audi.decreasingSpeed(30);
        audi.increasingSpeed(10);
    }
}
