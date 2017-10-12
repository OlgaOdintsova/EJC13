package com.epam.homework.second;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * напиши javadoc
 */
public class TrafficLight {

    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the number of minutes: ");
            String line = scanner.nextLine();
            int numberMinutes = validate(line) % 10;

            if (numberMinutes >= 0 && numberMinutes < 2) {
                System.out.println("The traffic light is Red.");
            } else if (numberMinutes >= 2 && numberMinutes < 5) {
                System.out.println("The traffic light is Yellow.");
            } else if (numberMinutes >= 5 && numberMinutes < 10) {
                System.out.println("The traffic light is Green!");
            }
        }
    }


    //проверяем валидность
    private static int validate(String line) {
        try {
            // Проверить что int
            int value = Integer.parseInt(line);

            // Проверить что не отрицательное
            if (value >= 0) {
                return value;
            } else {
                throw new NumberFormatException("Got a negative value");
            }
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("You entered the wrong number!!!");
        }
    }

}
