package com.step.assignments;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinutesAndSecondsTest {
    @Test
    @DisplayName("should return invalid value")
    void shouldReturnInvalidValueString() {
        String errorMessage = MinutesAndSeconds.getDurationString(-1);
        assertEquals("Invalid value",errorMessage);
    }

    @Test
    void shouldReturnHoursMinutesAndSeconds() {
        String errorMessage = MinutesAndSeconds.getDurationString(120,20);
        assertEquals("2h 0m 20s",errorMessage);
    }

    @Test
    void shouldReturnHoursMinutesAndSecondsForPassingSingleParam() {
        String errorMessage = MinutesAndSeconds.getDurationString(20);
        assertEquals("0h 0m 20s",errorMessage);
    }
}