package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        byte myByteVariable = 4;
        short myShortVariable = 16;
        int myIntVariable = 32;
        long myLongVariable = (50000L + 10L) * (myByteVariable + myShortVariable + myIntVariable);

        System.out.println(myLongVariable);

    }
}
