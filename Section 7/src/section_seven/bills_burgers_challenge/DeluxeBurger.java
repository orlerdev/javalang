package section_seven.bills_burgers_challenge;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Brisket", 19.10, "Texas Toast");
        super.addHamburgerAddition1("Chips", 0);
        super.addHamburgerAddition2("Drink", 0);
    }

    //Best to use final String variable to print the same message, but Udemy code checker does not accept it.
    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("No additional items allowed for Deluxe Burger.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("No additional items allowed for Deluxe Burger.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("No additional items allowed for Deluxe Burger.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("No additional items allowed for Deluxe Burger.");
    }
}
