package com.epam.homework.oop.task234.stationery.writing;

import com.epam.homework.oop.task234.ability.WriteAbility;

public class FountainPen extends Pen implements WriteAbility {

    public FountainPen(int price, String colour) {
        super(price, colour);
    }

    @Override
    public void write() {
        System.out.println("It's an Fountain Pen");
    }
}
