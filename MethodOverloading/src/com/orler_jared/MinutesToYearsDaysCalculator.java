package com.orler_jared;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else if (minutes > 525_599) {
            long years = minutes / 525_600;
            long days = (minutes % 525_600) / 1_440;

            String minString = minutes + " min = ";
            String yearsString = years + " y and ";
            // Optional formatting for double digits
            if (years < 10) {
                yearsString = "0" + years + " y and ";
            }
            String daysString = days + " d";
            // Optional formatting for double digits
            if (days < 10) {
                daysString = "0" + days + " d";
            }

            System.out.println(minString + yearsString + daysString);
        } else {
            long days = minutes / 1_440;

            String minString = minutes + " min = ";
            String yearsString = "00 y and ";
            String daysString = days + " d";
            // Optional formatting for double digits
            if (days < 10) {
                daysString = "0" + days + " d";
            }

            System.out.println(minString + yearsString + daysString);
        }

    }
}
