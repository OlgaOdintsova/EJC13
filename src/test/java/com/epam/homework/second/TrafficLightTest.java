package com.epam.homework.second;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrafficLightTest {

    @SuppressWarnings("ResultOfMethodCallIgnored")
    @Test
    void getRedColourByMinutes() {
        assertThrows(IllegalArgumentException.class, () -> TrafficLight.getColourByMinutes(-1));
        assertEquals("Red.", TrafficLight.getColourByMinutes(0));
        assertEquals("Red.", TrafficLight.getColourByMinutes(1));
        assertNotEquals("Red.", TrafficLight.getColourByMinutes(2));
    }

    @Test
    void getYellowColourByMinutes() {
        assertNotEquals("Yellow.", TrafficLight.getColourByMinutes(1));
        assertEquals("Yellow.", TrafficLight.getColourByMinutes(2));
        assertEquals("Yellow.", TrafficLight.getColourByMinutes(4));
        assertNotEquals("Yellow.", TrafficLight.getColourByMinutes(5));
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    @Test
    void getGreenColourByMinutes() {
        assertNotEquals("Green!", TrafficLight.getColourByMinutes(4));
        assertEquals("Green!", TrafficLight.getColourByMinutes(5));
        assertEquals("Green!", TrafficLight.getColourByMinutes(9));
        assertThrows(IllegalArgumentException.class, () -> TrafficLight.getColourByMinutes(10));
    }
}