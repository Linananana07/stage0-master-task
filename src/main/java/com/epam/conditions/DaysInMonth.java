package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        int[] thirty = {4, 6, 9, 11};
        String result = "31";
        if (year <= 0 || month < 0 || month > 12) {
            result = "invalid date";
        } else if (month == 2) {
            if (year % 4 == 0 && year != 1900) {
                result = "29";
            } else {
                result = "28";
            }
        } else {
            for (int i = 0; i < thirty.length; i++) {
                if (month == thirty[i]) {
                    result = "30";
                }
            }
        }
        System.out.println(result);
    }
}
