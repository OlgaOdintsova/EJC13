package com.epam.homework.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number: ");
        int value = Integer.parseInt(reader.readLine());

        if (value > 0 && value < 20) {
            for (int i = 1; i < value ; i++) {
                System.out.println("A student has passed " + i + " exams.");
            }
        } else {
            System.out.println("I like this number!");
        }
    }
}
