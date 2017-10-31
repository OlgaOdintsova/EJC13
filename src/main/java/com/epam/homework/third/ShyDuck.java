package com.epam.homework.third;

import com.epam.homework.third.possibility.FlyWithWings;
import com.epam.homework.third.possibility.MuteQuack;

public class ShyDuck extends AbstractDuck{
    public ShyDuck() {
        quackAbility = new MuteQuack();
        flyAbility = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a Shy duck.");
    }
}
