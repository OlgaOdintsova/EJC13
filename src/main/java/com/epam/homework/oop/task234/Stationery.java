package com.epam.homework.oop.task234;

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

}
