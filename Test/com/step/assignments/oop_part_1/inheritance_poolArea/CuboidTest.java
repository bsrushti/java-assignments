package com.step.assignments.oop_part_1.inheritance_poolArea;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboidTest {

    @Test
    @DisplayName("should return volume as zero when length,height and width provided as zero")
    void shouldReturnVolumeZero() {
        Cuboid cuboid = new Cuboid(0, 0, 0);
        assertEquals(0,cuboid.getVolume());
    }

    @Test
    @DisplayName("should return volume when valid length,height and width provided")
    void shouldReturnVolume() {
        Cuboid cuboid = new Cuboid(2, 1, 2);
        assertEquals(4.0,cuboid.getVolume());
    }
}