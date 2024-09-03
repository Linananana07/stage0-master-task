package com.epam.conditions;

import java.util.logging.Logger;

public class DaysInMonth {
    private static final Logger logger = Logger.getLogger(DaysInMonth.class.getName());

    public void printDays(int year, int month) {
        String result = getDaysInMonth(year, month);
        logger.info(result);
        System.out.println(result);
    }

    private String getDaysInMonth(int year, int month) {
        if (year <= 0 || month < 1 || month > 12) {
            return "invalid date";
        }

        switch (month) {
            case 2:
                return isLeapYear(year) ? "29" : "28";
            case 4:
            case 6:
            case 9:
            case 11:
                return "30";
            default:
                return "31";
        }
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
