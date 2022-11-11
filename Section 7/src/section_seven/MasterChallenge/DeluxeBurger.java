package section_seven.MasterChallenge;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Brisket", 10.99, "Texas Toast");
        super.addTopping1("Chips", 3.12);
        super.addTopping2("Drink", 1.99);

    }

    @Override
    public void addTopping1(String name, double price) {
        System.out.println("No additonal toppings allowed on the Deluxe Burger.");
    }

    @Override
    public void addTopping2(String name, double price) {
        System.out.println("No additonal toppings allowed on the Deluxe Burger.");
    }

    @Override
    public void addTopping3(String name, double price) {
        System.out.println("No additonal toppings allowed on the Deluxe Burger.");
    }

    @Override
    public void addTopping4(String name, double price) {
        System.out.println("No additonal toppings allowed on the Deluxe Burger.");
    }
}
