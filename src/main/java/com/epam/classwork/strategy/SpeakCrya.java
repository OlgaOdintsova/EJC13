package com.epam.classwork.strategy;

public class SpeakCrya implements SpeakBehavior {

    @Override
    public void speak() {

        System.out.println("Quack quack quack");
    }
}
