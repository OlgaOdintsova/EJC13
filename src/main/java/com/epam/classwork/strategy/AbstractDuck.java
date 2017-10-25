package com.epam.classwork.strategy;

public abstract class AbstractDuck {
    protected SpeakBehavior speakBehavior;

    protected AbstractDuck() {
    }

    public abstract void getInfo();

    public AbstractDuck(SpeakBehavior speakBehavior) {

        this.speakBehavior = speakBehavior;
    }

    public void getVoice() {

        speakBehavior.speak();
    }
}
