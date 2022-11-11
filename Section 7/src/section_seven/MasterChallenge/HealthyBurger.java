package section_seven.MasterChallenge;

public class HealthyBurger extends Hamburger {
    private String healthySpecial1Name;
    private double healthySpecial1Price;

    private String healthySpecial2Name;
    private double healthySpecial2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, price, "Brown Rye");
    }

    public void addHealthySpecial1(String name, double price) {
        this.healthySpecial1Name = name;
        this.healthySpecial1Price = price;
    }

    public void addHealthySpecial2(String name, double price) {
        this.healthySpecial2Name = name;
        this.healthySpecial2Price = price;
    }

    @Override
    public double totalBurgerPrice() {
        double healthyBurgerPrice = super.totalBurgerPrice();

        if (this.healthySpecial1Name != null) {
            healthyBurgerPrice += this.healthySpecial1Price;
            System.out.println("Added " + this.healthySpecial1Name + " for " + "$" + this.healthySpecial1Price);
        }

        if (this.healthySpecial2Name != null) {
            healthyBurgerPrice += this.healthySpecial2Price;
            System.out.println("Added " + this.healthySpecial2Name + " for " + "$" + this.healthySpecial2Price);
        }

        return healthyBurgerPrice;
    }
}
