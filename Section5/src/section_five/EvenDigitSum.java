package section_five;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int initialNumber = number;
        int sum = 0;

        while (initialNumber != 0) {
            int checkNum = initialNumber % 10;

            if (checkNum % 2 == 0) {
                sum += checkNum;
            }

            initialNumber /= 10;
        }
        return sum;
    }
}





