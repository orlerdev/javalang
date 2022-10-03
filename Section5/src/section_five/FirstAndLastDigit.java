package section_five;

public class FirstAndLastDigit {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int firstDigit = number;
        System.out.println(number);
        while (firstDigit > 9) {
            firstDigit = firstDigit / 10;
            System.out.println(firstDigit);
        }
        int lastDigit = number % 10;
        System.out.println(firstDigit + " " + lastDigit);
        return firstDigit + lastDigit;
    }
}
