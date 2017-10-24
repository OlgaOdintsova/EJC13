package com.epam.homework.third;

public class Farm {
    public static void main(String[] args) {
        Duck[] ducks = new Duck [2];
        ducks[0] = new ShyDuck();
        ducks[1] = new NoizeDuck();
    }
}
