package com.epam.homework;

import java.util.Scanner; // импортируем класс

public class StudentScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // создаём объект класса Scanner
        String string = scanner.nextLine();
        System.out.print("Enter something");

//        if(string.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
//            int i = string.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
//            System.out.println(i*2);
//        } else {
//            System.out.println("Вы ввели не целое число");
//        }

    }
}
