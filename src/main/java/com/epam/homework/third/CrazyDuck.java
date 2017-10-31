package com.epam.homework.third;

import com.epam.homework.third.possibility.FlyWithWings;
import com.epam.homework.third.possibility.Squek;

public class CrazyDuck extends AbstractDuck {
    public CrazyDuck() {
        quackAbility = new Squek();
        flyAbility = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a Crazy duck.");
    }
}
