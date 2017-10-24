package com.epam.homework.second;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrafficLightTest {

    @Test
    void testValidate() {
        assertThrows(IllegalArgumentException.class, () -> TrafficLight.validate("word"));
        assertThrows(IllegalArgumentException.class, () -> TrafficLight.validate("-1"));
        assertEquals(999, TrafficLight.validate("999"));
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    @Test
    void testGetRedColourByMinutes() {
        assertThrows(IllegalArgumentException.class, () -> TrafficLight.getColourByMinutes(-1));
        assertEquals("Red.", TrafficLight.getColourByMinutes(0));
        assertEquals("Red.", TrafficLight.getColourByMinutes(1));
        assertNotEquals("Red.", TrafficLight.getColourByMinutes(2));
    }

    @Test
    void testGetYellowColourByMinutes() {
        assertNotEquals("Yellow.", TrafficLight.getColourByMinutes(1));
        assertEquals("Yellow.", TrafficLight.getColourByMinutes(2));
        assertEquals("Yellow.", TrafficLight.getColourByMinutes(4));
        assertNotEquals("Yellow.", TrafficLight.getColourByMinutes(5));
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    @Test
    void testGetGreenColourByMinutes() {
        assertNotEquals("Green!", TrafficLight.getColourByMinutes(4));
        assertEquals("Green!", TrafficLight.getColourByMinutes(5));
        assertEquals("Green!", TrafficLight.getColourByMinutes(9));
        assertThrows(IllegalArgumentException.class, () -> TrafficLight.getColourByMinutes(10));
    }
}