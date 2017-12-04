package com.epam.homework.oop.task234.stationery;

import com.epam.homework.oop.task234.ability.WriteAbility;

public class Pen extends ThingForWriting implements WriteAbility {

    public Pen(int price, String colour) {
        super(price, colour);
    }

    @Override
    public void write() {
        super.write();
    }

}
