package com.epam.classwork.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String duckName = reader.readLine();
        AbstractDuck duck;
        if (duckName.equals("willi")) {
            duck = new RedHeadDuck(new SpeakCrya());
        } else {
            duck = new ToyDuck(new SpeakNoWay());
        }
        duck.getVoice();
    }
}
