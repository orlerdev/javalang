package section_five;

public class ForLoopIntro {
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static void loopedInterest(double monies) {

        for (double i = 2; i < 9; i++) {
            System.out.printf("%.2f%n", calculateInterest(monies, i));
        }
    }

    public static void reversedInterest(double monies) {

        for (double i = 8; i > 1; i--) {
            System.out.printf("%.2f%n", calculateInterest(monies, i));
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeLoop(int a, int b) {
        int count = 0;

        for (int i = a; i <= b; i++) {
            if (count == 10) {
                break;
            } else if (isPrime(i)) {
                System.out.println(i);
                count++;
            }

        }
    }
}
