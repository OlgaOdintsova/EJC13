package com.epam.homework.oop.task234;

public abstract class ThingForWriting extends Stationery implements WriteAbility {

    private String colour;

    public ThingForWriting(int price, String colour) {
        super(price);
        this.colour = colour;
    }

   @Override
   public void write() {
        System.out.println("It's can write something");
    }
}
