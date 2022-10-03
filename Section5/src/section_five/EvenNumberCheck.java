package section_five;

public class EvenNumberCheck {
    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static void numberRange() {
        int startNum = 4;
        int endNum = 20;
        int evenNums = 0;

        while (startNum < endNum) {
            startNum++;
            if (!isEvenNumber(startNum)) {
                continue;
            }
            System.out.println("Even number " + startNum);
            evenNums++;

            if (evenNums == 5) {
                System.out.println("That makes " + evenNums + " even numbers");
                break;
            }

        }

    }
}
