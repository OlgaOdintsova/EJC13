package com.epam.homework.third;

public abstract class AbstractDuck  {
    FlyAbility flyAbility;
    QuackAbility quackAbility;

    public AbstractDuck() {
    }

    public abstract void display();

    public void swim() {
        System.out.println("I like to swim very much.");
    }

    public void performFly() {
        flyAbility.fly();
    }

    public void performQuack() {
        quackAbility.quack();
    }
}

