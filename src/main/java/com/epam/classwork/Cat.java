package com.epam.classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cat {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.print("Enter the name of cat: ");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("This is " + cat.checkBarsik(reader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    String checkBarsik(String name) {
        if ("Barsik".equals(name)) {
            return name;
        }
        throw new IllegalArgumentException("It isn't Barsik");
    }
}