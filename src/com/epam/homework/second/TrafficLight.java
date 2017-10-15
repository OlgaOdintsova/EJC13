package com.epam.homework.second;

import java.util.Scanner;

/**
 * Предназначен для решения следующей задачи:
 * Светофор горящий красным - 2 минуты, желтым - 3 минуты, зелёным - 5 минут.
 * В часе 60 минут, на 60 начинаем с начала.
 * С консоли вводятся минуты, возвращается цвет светофора.
 * @author Olga Odintsova
 */
public class TrafficLight {

    /**
     * Точка входа в приложение
     * @param args Аргументы командной строки, передаваемые при старте приложения.
     */
    public static void main(String[] args) {
        System.out.print("Enter the number of minutes: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int numberMinutes = validate(line) % 10;
        System.out.println("The traffic light is " + getColourByMinutes(numberMinutes));
    }

    /**
     * Сопоставляет указанной минуте цвет:<br>
     * 0-1 => Red<br>
     * 2-4 => Yellow<br>
     * 5-9 => Green<br>
     * @param numberMinutes Минута, заданная в диапазоне от 0 до 9.
     * @return Цвет светофора в данную минуту.
     */
    private static String getColourByMinutes(int numberMinutes) {
        if (numberMinutes >= 0 && numberMinutes < 2) {
            return "Red.";
        } else if (numberMinutes >= 2 && numberMinutes < 5) {
            return "Yellow.";
        } else {
            return "Green!";
        }
    }

    /**
     * Осуществляет проверку валидности введённых с клавиатуры данных.
     * @param line Введённая пользователем строка.
     * @return Значение, успешно прошедшее проверку.
     * @throws IllegalArgumentException В случае, если введенная строка не прошла проверку.
     */
    private static int validate(String line) throws IllegalArgumentException {
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
