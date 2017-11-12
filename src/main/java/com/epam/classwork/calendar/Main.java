package com.epam.classwork.calendar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int enterMonth;

    public static void main(String[] args) throws IOException {
        System.out.println("Enter number of month: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();

        try {
            enterMonth = Integer.parseInt(line);
        } catch (IllegalArgumentException ex) {
            System.err.println("You entered not integer number " + ex);
            throw new IllegalArgumentException("You entered not integer number ");
        }

        System.out.println(Calendar.chooseMonth(enterMonth));
    }
}
