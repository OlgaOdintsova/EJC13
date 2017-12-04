package com.epam.homework.oop.task2;


import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        StationeryList employeeStationary = new StationeryList();
        BeginnerKit beginnerKit = new BeginnerKit();
        System.out.println("This application is for accounting of all employee's office supplies.\n");

        do {
            System.out.println("You have to choose the action:\n" +
                    "ADD - add new stationery\n" +
                    "SUM - get a full price of stationary \n" +
                    "EXIT - Exiting the application");
            System.out.print("Enter the command: ");

            String line = scanner.nextLine();

            try {
                switch (Action.valueOf(line.toUpperCase())) {
                    case ADD:
                        main.getAdd(employeeStationary, scanner);
                        System.out.println("You added a stationary.");
                        break;

                    case KIT:
                        employeeStationary.addAll(List<Stationery> beginnerKit);
                        break;

                    case SUM:
                        System.out.println("The full price of stationary of the employee: " + employeeStationary.getPrice());
                        break;

                    case EXIT:
                        System.out.println("Closing the application.");
                        return;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("You entered an invalid command. Try again.");

            }
            System.out.println("Do you want to continue working? 1 - yes 0 - no");
        } while (scanner.nextInt() == 1);


    }

    void getAdd(StationeryList employeeStationary, Scanner scanner) {
        System.out.println("What kind of stationery do you want to add?\n" +
                            "1 - Pen\n" +
                            "2 - FountainPen\n" +
                            "3 - Pencil\n" +
                            "4 - Marker\n" +
                            "5 - Notebook\n" +
                            "6 - Sticker\n" +
                            "7 - Rubber\n");

        String line = scanner.nextLine();

        if ("1".equals(line)) {
            System.out.println("Enter price and color with space: ");
            int price = scanner.nextInt();
            String colour = scanner.nextLine();
            employeeStationary.add(new Pen(price, colour));
        }
        if ("2".equals(line)) {
            System.out.println("Enter price and color with space: ");
            int price = scanner.nextInt();
            String colour = scanner.nextLine();
            employeeStationary.add(new FountainPen(price, colour));
        }
        if ("3".equals(line)) {
            System.out.println("Enter price and color with space: ");
            int price = scanner.nextInt();
            String colour = scanner.nextLine();
            employeeStationary.add(new Pencil(price, colour));
        }
        if ("4".equals(line)) {
            System.out.println("Enter price and color with space: ");
            int price = scanner.nextInt();
            String colour = scanner.nextLine();
            employeeStationary.add(new Marker(price, colour));
        }
        if ("5".equals(line)) {
            System.out.println("Enter price: ");
            int price = scanner.nextInt();
            employeeStationary.add(new Notebook(price));
        }
        if ("6".equals(line)) {
            System.out.println("Enter price: ");
            int price = scanner.nextInt();
            employeeStationary.add(new Sticker(price));
        }
        if ("7".equals(line)) {
            System.out.println("Enter price: ");
            int price = scanner.nextInt();
            employeeStationary.add(new Rubber(price));
        }
    }

}
