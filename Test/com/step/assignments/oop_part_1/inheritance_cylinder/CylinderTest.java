package com.step.assignments.oop_part_1.inheritance_cylinder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    @DisplayName("should return volume of cylinder as zero")
    void shouldReturnVolumeZero() {
        Cylinder cylinder = new Cylinder(0, 0);
        assertEquals(0,cylinder.getVolume());
    }

    @Test
    @DisplayName("should return volume of cylinder while passing valid radius and height")
    void shouldReturnCalculatedVolume() {
        Cylinder cylinder = new Cylinder(1, 1);
        assertEquals(3.141592653589793,cylinder.getVolume());
    }

}