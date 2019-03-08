package com.step.assignments.oop_part_1.inheritance_poolArea;


public class Rectangle {
    private double length=0, width=0;

    public Rectangle(double width, double length) {
        if(length>0) this.length=length;

        if(width>0) this.width=width;
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