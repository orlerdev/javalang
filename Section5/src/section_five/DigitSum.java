package section_five;

public class DigitSum {
    public static int sumDigits(int number) {
        // sum of 125 would be: (1 + 2) + 5 = 8
        // use (number % 10) to extract the digit with the lowest place value
        // use (number/10) to remove that same digit
        if (number < 10) {
            return -1;
        }
        int sum = 0;

        while (number > 0) {
            // extracts the lowest place value digit
            // also called the least significant digit
            int digit = number % 10;
            // add the extracted digit to the sum
            sum += digit;
            // remove the digit by dividing the number by 10
            number /= 10;
            // starts loop over, with one less digit
        }
        return sum;
    }
}
