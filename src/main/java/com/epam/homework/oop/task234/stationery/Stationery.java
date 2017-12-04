package com.epam.homework.oop.task234.stationery;

import com.epam.homework.oop.task234.ability.CountAbility;

import java.util.Objects;

public abstract class Stationery implements CountAbility {
    private int price;

    public Stationery(int price) {
       this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return '{' + getClass().getSimpleName() + " price = " + price + '}';
    }
}
