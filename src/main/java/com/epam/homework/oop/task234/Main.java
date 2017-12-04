package com.epam.homework.oop.task234;


import com.epam.homework.oop.task234.stationery.*;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        StationeryList employeeStationary = new StationeryList();
        BeginnerKit beginnerKit = new BeginnerKit();
        System.out.println("This application is for accounting of all employee's office supplies.");

        do {
            System.out.println("\nYou have to choose the action:\n" +
                    "ADD - add a new stationery\n" +
                    "KIT - add a Beginner's Kit \n" +
                    "SHOW - show the list of employee's office supplies \n" +
                    "SUM - get a full price of stationary \n" +
                    "EXIT - Exiting the application");
            System.out.print("Enter the command: ");

            String line = scanner.nextLine();

            try {
                switch (Action.valueOf(line.toUpperCase())) {
                    case ADD:
                        main.getAdd(employeeStationary, scanner);
                        System.out.println("You added a new stationary.");
                        break;

                    case KIT:
                        employeeStationary.addAll(beginnerKit.getBeginnerList());
                        System.out.println("You added a new Beginer's Kit.");
                        break;

                    case SHOW:
                        System.out.println("All employee's stationeries: \n");
                        System.out.println(employeeStationary);
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
                System.out.println("Do you want to continue working? 1 - yes 0 - no");

                if (Integer.valueOf(scanner.nextLine()) == 0) {
                    return;
                }
            }
        } while (true);
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
            employeeStationary.add(new Pen(getPrice(scanner), getColour(scanner)));
        }else if ("2".equals(kind)) {
            employeeStationary.add(new FountainPen(getPrice(scanner), getColour(scanner)));
        }else if ("3".equals(kind)) {
            employeeStationary.add(new Pencil(getPrice(scanner), getColour(scanner)));
        }else if ("4".equals(kind)) {
            employeeStationary.add(new Marker(getPrice(scanner), getColour(scanner)));
        }else if ("5".equals(kind)) {
            employeeStationary.add(new Notebook(getPrice(scanner)));
        }else if ("6".equals(kind)) {
            employeeStationary.add(new Sticker(getPrice(scanner)));
        }else if ("7".equals(kind)) {
            employeeStationary.add(new Rubber(getPrice(scanner)));
        }
    }

    private int getPrice(Scanner scanner) {
        System.out.println("Enter price: ");
        return Integer.valueOf(scanner.nextLine());
    }

    private String getColour (Scanner scanner) {
        System.out.println("Enter colour: ");
        return String.valueOf(scanner.nextLine());
    }


}
