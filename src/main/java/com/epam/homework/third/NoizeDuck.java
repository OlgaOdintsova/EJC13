package com.epam.homework.third;

import com.epam.homework.third.possibility.FlyNoWay;
import com.epam.homework.third.possibility.Quack;

public class NoizeDuck extends AbstractDuck {
    public NoizeDuck() {
        quackAbility = new Quack();
        flyAbility = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a Noize duck.");
    }
}
