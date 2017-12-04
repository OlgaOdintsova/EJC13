package com.epam.homework.oop.task2;

public class Pen extends ThingForWriting implements WriteAbility {

    public Pen(int price, String colour) {
        super(price, colour);
    }

    @Override
    public void write() {
        super.write();
    }

}
