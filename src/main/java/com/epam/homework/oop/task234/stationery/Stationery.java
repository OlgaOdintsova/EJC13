package com.epam.homework.oop.task234.stationery;

import com.epam.homework.oop.task234.ability.CountAbility;


public abstract class Stationery implements CountAbility, Comparable<Stationery> {
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
        return '{' + getShortName() + " price = " + price + '}';
    }

    @Override
    public int compareTo(Stationery other) {
        return Integer.compare(this.price, other.price);
    }

    public String getShortName() {
       return getClass().getSimpleName();
    }
}
