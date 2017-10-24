package com.epam.classwork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    @Test
    void checkBarsik() {
        Cat catNotBarsik = new Cat();
        assertThrows(IllegalArgumentException.class, ()-> catNotBarsik.checkBarsik("bug"));
        assertEquals("Barsik", catNotBarsik.checkBarsik("Barsik"));
    }

}