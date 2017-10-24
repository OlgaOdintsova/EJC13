package com.epam.homework.third;

public class NoizeDuck implements Duck {
    @Override
    public String quack() {
        return "Quack quack quack";
    }

    @Override
    public String fly() {
        return null;
    }
}
