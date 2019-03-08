package com.step.assignments.oop_part_1.inheritance_poolArea;


public class Rectangle {
    private double length, width;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;

        if(length<0) this.length=0;
        if(width<0) this.width=0;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return this.length*this.width;
    }
}