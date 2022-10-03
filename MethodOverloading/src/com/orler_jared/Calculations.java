package com.orler_jared;

public class Calculations {
    public static double calcFeetAndInchesToCentimters(double feet, double inches) {

        double centiFeet = feet * 30.48;
        double centiInch = inches * 2.54;

        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        } else return centiFeet + centiInch;

    }

    public static double calcFeetAndInchesToCentimters(double inches) {
        double inchToFeet = (int) (inches / 12);
        double leftOverInches = inches % 12;
        if (inches < 0) {
            return -1;
        } else if (inches < 12) {
            return inches * 2.54;
        } else
            return calcFeetAndInchesToCentimters(inchToFeet, leftOverInches);
    }

}

