package com.step.assignments.oop_part_1.inheritance_poolArea;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    @DisplayName("should return area of rectangle as zero")

    public void shouldReturnAreaAsZero(){
        Rectangle rectangle = new Rectangle(0.0, 1);
        assertEquals(0,rectangle.getArea());
    }

    @Test
    @DisplayName("should return area of rectangle when length and width greater than zero")

    public void shouldReturnAreaAsOne(){
        Rectangle rectangle = new Rectangle(1, 1);
        assertEquals(1,rectangle.getArea());
    }
}