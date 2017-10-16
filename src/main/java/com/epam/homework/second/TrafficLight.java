package com.epam.homework.second;

import java.util.Scanner;

/**
 * It is designed to solve the following problem:
 * The traffic light lights red - 2 minutes, yellow - 3 minutes, green - 5 minutes.
 * Colors are successively replacing each other.
 * When you enter from the console minutes, the color of the traffic light returns.
 * @author Olga Odintsova
 */
public class TrafficLight {

    /**
     * App entry point
     * @param args Command-line arguments passed when the application starts.
     */
    public static void main(String[] args) {
        System.out.print("Enter the number of minutes: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int numberMinutes = validate(line) % 10;
        System.out.println("The traffic light is " + getColourByMinutes(numberMinutes));
    }

    /**
     * Correlation of the specified minute and color:<br>
     * 0-1 => Red<br>
     * 2-4 => Yellow<br>
     * 5-9 => Green<br>
     * @param numberMinutes The minute specified in the range from 0 to 9.
     * @return The color of the traffic light at the moment.
     * @throws IllegalArgumentException If the given minute not in the range.
     */
    static String getColourByMinutes(int numberMinutes) throws IllegalArgumentException {
        if (numberMinutes >= 0 && numberMinutes < 2) {
            return "Red.";
        } else if (numberMinutes >= 2 && numberMinutes < 5) {
            return "Yellow.";
        } else if (numberMinutes >= 5 && numberMinutes < 10) {
            return "Green!";
        } else {
            throw new IllegalArgumentException("The minute should be in the range from 0 to 9.");
        }
    }

    /**
     * Verifies the validity of the data entered from the keyboard.
     * @param line The string entered by the user.
     * @return A value that passed successfully.
     * @throws IllegalArgumentException In case the entered string didn't pass the test.
     */
    static int validate(String line) throws IllegalArgumentException {
        try {
            int value = Integer.parseInt(line);

            if (value >= 0) {
                return value;
            } else {
                throw new NumberFormatException("Got a negative value");
            }
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("The number is not correct!!!");
        }
    }
}
