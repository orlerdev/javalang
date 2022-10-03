package section_five;

public class SwitchStatement {
    // Create a new switch statement using char instead of int
    // create a new char variable
    // create a switch statement for testing for
    // A, B, C, D, or E
    // display a message if any of these are found and the break
    // Add a default which displays a message saying not found
    public static void switchStatement(char switchStatement) {
        char switchValue = switchStatement;

        switch (switchValue) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println(switchValue + "was found");
                break;

            default:
                System.out.println("Could not find A, B, C, D, or E");
                break;

        }
    }

    public static void switchMonths(String month) {
        // Prevents case sensitivity
        switch(month.toUpperCase()) {
            case "JANUARY":
                System.out.println("Jan");
                break;
            case "FEBRUARY":
                System.out.println("Feb");
                break;
            case "MARCH":
                System.out.println("Mar");
                break;
            default:
                System.out.println("Probably one of the other months");
        }
    }
}
