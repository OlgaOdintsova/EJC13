package com.epam.homework.third.possibility;

import com.epam.homework.third.QuackAbility;

public class MuteQuack implements QuackAbility {
    @Override
    public void quack() {
        System.out.println("<< silence >>");
    }
}
