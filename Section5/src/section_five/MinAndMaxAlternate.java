package section_five;

import java.util.Scanner;

public class MinAndMaxAlternate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min;
        int max;

        while (true) {
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();
            min = 0;
            max = 0;
            boolean first = true;

            if (isAnInt) {
                int number = scanner.nextInt();

                //boolean flag sets both values to the first entered value
                //first if statement sets the value of first to false
                //all other values entered will not change the initial values of min and max
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }

                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine(); //handle input

        }
        System.out.println("min = " + min + ", max = " + max);
            scanner.close();
    }
}
