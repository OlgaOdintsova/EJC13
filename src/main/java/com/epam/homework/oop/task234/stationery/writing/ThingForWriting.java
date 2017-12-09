package com.epam.homework.oop.task234.stationery.writing;

import com.epam.homework.oop.task234.ability.WriteAbility;
import com.epam.homework.oop.task234.stationery.Stationery;

public abstract class ThingForWriting extends Stationery implements WriteAbility {

    private String colour;

    ThingForWriting(int price, String colour) {
        super(price);
        this.colour = colour;
    }

   @Override
   public void write() {
        System.out.println("It's can write something");
    }

    @Override
    public String toString() {
        String str = super.toString();
        return str.substring(0, str.length() - 1) + ", colour = " + colour + '}';
    }
}
