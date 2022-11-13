package ReverseArrayChallenge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Regular array is: " + Arrays.toString(array));

        reverse(array);


    }

    private static void reverse(int[] array) {
        int n = array.length;
        int[] reversedArray = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            reversedArray[j - 1] = array[i];
            j = j - 1;
        }
        System.out.println("Regular array is: " + Arrays.toString(array));
        System.out.println("Reversed array is: " + Arrays.toString(reversedArray));

    }
}
