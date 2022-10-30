package section_five;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class MinimumAndMaximumChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> userInputs = new ArrayList<>();
        int min;
        int max;
        System.out.println("Enter number:");

        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            System.out.println("Enter number:");

            if (isAnInt) {
                userInputs.add(scanner.nextInt());
                Collections.sort(userInputs);
            } else {
                break;
            }
        }
        scanner.nextLine(); // handle end of line (enter key)
        min = userInputs.get(0);
        max = userInputs.get(userInputs.size() - 1);
        System.out.println("The minimum number is " + min + " and the maximum number is " + max);

        scanner.close();

    }
}
