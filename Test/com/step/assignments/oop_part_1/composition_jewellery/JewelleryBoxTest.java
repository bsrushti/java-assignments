package com.step.assignments.oop_part_1.composition_jewellery;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewelleryBoxTest {

    @Test
    @DisplayName("should return total jewellery count of jewellery box")

    void shouldReturnTotalJewelleryInsideBox() {
        JewelleryBox _5thLevelBox = new JewelleryBox();

        JewelleryBox _4thLevelBox = new JewelleryBox(_5thLevelBox);

        Jewellery necklace = new Jewellery("necklace");
        JewelleryBox _3rdLevelBox = new JewelleryBox(necklace, _4thLevelBox);

        Jewellery ring = new Jewellery("ring");
        JewelleryBox _2ndLevelBox = new JewelleryBox(ring, _3rdLevelBox);

        JewelleryBox _1stLevelBox = new JewelleryBox(_2ndLevelBox);

        assertEquals(2, _1stLevelBox.totalJewelleries());
    }

    @Test
    @DisplayName("should return 0 when no jewellery provided")
    void shouldReturnZero() {
        JewelleryBox _1stLevelBox = new JewelleryBox();

        assertEquals(0, _1stLevelBox.totalJewelleries());
    }

    @Test
    @DisplayName("should return 1 when one jewellery provided")
    void shouldReturnOne() {
        Jewellery ring = new Jewellery("ring");
        JewelleryBox _1stLevelBox = new JewelleryBox(ring);

        assertEquals(1, _1stLevelBox.totalJewelleries());
    }
}