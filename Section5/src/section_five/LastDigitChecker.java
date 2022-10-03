package section_five;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }
        int lastA = a % 10;
        int lastB = b % 10;
        int lastC = c % 10;

        return lastA == lastB || lastA == lastC || lastB == lastC;
    }
    public static boolean isValid(int num) {
        return num > 9 && num <= 1000;
    }
}


