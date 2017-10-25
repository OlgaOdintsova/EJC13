package com.epam.classwork.strategy;

public class RedHeadDuck extends AbstractDuck{
    public RedHeadDuck(SpeakBehavior speakBehavior) {

        super(speakBehavior);
    }

    @Override
    public void getInfo() {

        System.out.println("I am redhat duck");
    }
}
