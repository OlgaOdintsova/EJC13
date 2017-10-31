package com.epam.homework.third;

public class DuckFarm {
    public static void main(String[] args) {
        AbstractDuck ducks[] = {
                new ShyDuck(),
                new NoizeDuck(),
                new CrazyDuck()
        };

        for (AbstractDuck duck : ducks) {
            System.out.println();
            duck.display();
            duck.performFly();
            duck.performQuack();
            duck.swim();
        }
    }
}
