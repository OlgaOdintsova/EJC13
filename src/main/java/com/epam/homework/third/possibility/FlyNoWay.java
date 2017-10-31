package com.epam.homework.third.possibility;

import com.epam.homework.third.FlyAbility;

public class FlyNoWay implements FlyAbility {
    @Override
    public void fly() {
        System.out.println("I have to stay here...");
    }
}
