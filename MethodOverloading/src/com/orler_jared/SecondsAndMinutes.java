package com.orler_jared;

public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void getDurationString(int minutes, int seconds) {
        if (seconds < 0 || seconds > 59 || minutes < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else if (minutes < 59) {
            System.out.println(0 + "h " + minutes + "m " + seconds + "s");
        } else {
            int hour = minutes / 60;
            int mins = minutes % 60;
            System.out.println(hour + "h " + mins + "m " + seconds + "s");
        }
    }

    public static void getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else if (seconds > 59) {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            getDurationString(minutes, seconds);
        } else {
            System.out.println(0 + "h " + 0 + "m " + seconds + "s");
        }
    }

    private static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }

        long hour = minutes / 60;
        long mins = minutes % 60;

        String hoursString = hour + "h";
        if (hour < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = mins + "m";
        if (mins < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return hoursString + " " + minutesString + " " + secondsString + "";
    }

}

