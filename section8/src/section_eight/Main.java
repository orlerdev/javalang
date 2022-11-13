package section_eight;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherValue = myIntValue;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anothervalue = " + anotherValue);

        anotherValue++;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anothervalue = " + anotherValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[]{4, 5, 6, 7, 8};

        modifyArray(myIntArray);
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));
        System.out.println("after modify change myIntArray = " + Arrays.toString(myIntArray));


    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[]{1, 2, 3, 4, 5};
    }
}
