package com.epam.classwork.calendar;

public class Calendar {

    public static String chooseMonth(int enterMonth) {

        switch (enterMonth) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 10:
                return "September";
            case 11:
                return "October";
            case 12:
                return "November";
            default:
                return "December";
        }
    }
}
