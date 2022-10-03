package section_five;

public class Sum3And5 {
    public static void sum3And5(){
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
                System.out.println(i + " meets the criteria");
                sum += i;
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("The total sum of acceptable values is " + sum);
    }
}
