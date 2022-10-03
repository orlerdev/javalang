package coding_exercises;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
        firstNum = firstNum * 1000;
        secondNum = secondNum * 1000;

        int a = (int) firstNum;
        int b = (int) secondNum;

        return a == b;

    }
}
