package com.orler_jared;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {

        if (temperature > 24 && temperature < 36) {
            return true;
        } else if (temperature > 24 && temperature < 46 && summer) {
            return true;
        } else {
            return false;
        }
    }
}
