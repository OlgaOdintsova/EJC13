package com.epam.homework.oop.task234;


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
                    "ADD - add a new stationery\n" +
                    "KIT - add a Beginner's Kit \n" +
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
                        employeeStationary.addAll(beginnerKit.getBeginnerList());
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
        } while (Integer.valueOf(scanner.nextLine()) == 1);


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

        String kind = scanner.nextLine();

        if ("1".equals(kind)) {
            System.out.println("Enter price and color with space: ");
            int price = Integer.valueOf(scanner.nextLine());
            String colour = String.valueOf(scanner.nextLine());
            employeeStationary.add(new Pen(price, colour));
        }
        if ("2".equals(kind)) {
            System.out.println("Enter price and color with space: ");
            int price = Integer.valueOf(scanner.nextLine());
            String colour = String.valueOf(scanner.nextLine());
            employeeStationary.add(new FountainPen(price, colour));
        }
        if ("3".equals(kind)) {
            System.out.println("Enter price and color with space: ");
            int price = Integer.valueOf(scanner.nextLine());
            String colour = String.valueOf(scanner.nextLine());
            employeeStationary.add(new Pencil(price, colour));
        }
        if ("4".equals(kind)) {
            System.out.println("Enter price and color with space: ");
            int price = Integer.valueOf(scanner.nextLine());
            String colour = String.valueOf(scanner.nextLine());
            employeeStationary.add(new Marker(price, colour));
        }
        if ("5".equals(kind)) {
            System.out.println("Enter price: ");
            int price = Integer.valueOf(scanner.nextLine());
            employeeStationary.add(new Notebook(price));
        }
        if ("6".equals(kind)) {
            System.out.println("Enter price: ");
            int price = Integer.valueOf(scanner.nextLine());
            employeeStationary.add(new Sticker(price));
        }
        if ("7".equals(kind)) {
            System.out.println("Enter price: ");
            int price = Integer.valueOf(scanner.nextLine());
            employeeStationary.add(new Rubber(price));
        }
    }

}
