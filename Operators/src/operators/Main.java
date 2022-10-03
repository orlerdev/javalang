package operators;

public class Main {
    public static void main(String[] args) {
        // OPERATORS
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println(" 1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; //3 - 1 = 2
        System.out.println("3 - 1 = " + previousResult);
        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);
        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);
        result = result % 3; //the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // OPERATOR ABBREVIATIONS

        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

//        result -= 0; // 3 - 0 = 3

        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 10 = " + result);

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien!");
        }

        int topScore = 100;
        if (topScore != 100) {
            System.out.println("You have the high score!");
        }

        boolean isCar = true;
        if (isCar) {
            System.out.println("There is a car here.");
        } else {
            System.out.println("There is not a car here.");
        }

        int ageOfPatron = 18;
        boolean oldEnough = (ageOfPatron >= 21) ? true : false;
        System.out.println(oldEnough);

        double firstDouble = 20.00;
        System.out.println(firstDouble);
        double secondDouble = 80.00;
        System.out.println(secondDouble);
        double totalDouble = (firstDouble + secondDouble) * 100.00d;
        System.out.println(totalDouble);
        double remainderDouble = totalDouble % 40.00d;
        System.out.println(remainderDouble);
        boolean firstBoolean = remainderDouble == 0;
        System.out.println(firstBoolean);
        boolean secondBoolean = firstBoolean;
        if (!secondBoolean) {
            System.out.println("Got some remainder");
        }

    }
}
