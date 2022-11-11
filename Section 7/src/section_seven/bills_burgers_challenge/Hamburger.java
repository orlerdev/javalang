package section_seven.bills_burgers_challenge;
//The purpose of this application is to help a company called Bill's Burgers manage the process of selling their hamburgers.
//Create (3) classes, Hamburger, DeluxeBurger, and HealthyBurger

//Hamburger
//There needs to be (4) variables
//String name, String meat, double price, String breadRollType
//A constructor for all variables is needed

//Also needs (4) separate variables for possible additions to the hamburger, declared with the following names:
//String  addition1Name, double addition1Price
//String  addition2Name, double addition2Price
//String  addition3Name, double addition3Price
//String  addition4Name, double addition4Price

//(5) methods are needed inside the Hamburger class
//(4) methods for adding up to (4) additions to the hamburger
//The name and price must be accepted as parameters for the first (4) methods
//(1) for printing out an itemized listing of the final burger, with addons if there are any, and the total price
//The methods should be declared as follows:
//addHamburgerAddition1 <does NOT return a value>
//addHamburgerAddition2 <does NOT return a value>
//addHamburgerAddition3 <does NOT return a value>
//addHamburgerAddition4 <does NOT return a value>
//itemizeHamburger <returns: double totalPrice of base burger price + any addons>

//DeluxeBurger
//No additional member variables
//Constructor does not accept parameters
//Constructor creates a deluxe burger with all the fixings, chips, and a drink
//DeluxeBurger price is set: $19.10
//Override addon methods from Hamburger
//Replace setting values with message stating no additional items are allowed for DeluxeBurger

//HealthyBurger
//(4) additional member variables
//String healthyExtra1Name
//double healthyExtra1Price
//String healthyExtra2Name
//double healthyExtra2Price
//Constructor accepts (2) parameters for meat and price
//Constructor also sets appropriate name and breadRollType defaults for this burger
//(2) methods: addHealthyAddition1 & addHealthyAddition2 required
//Each method accepts (2) parameters for String name and double price
//Override itemizeHamburger with message for appropriate burger type and additions
//Overridden method also returns double totalHealthyPrice for total price

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        addition1Name = name;
        addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        addition2Name = name;
        addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        addition3Name = name;
        addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        addition4Name = name;
        addition4Price = price;
    }

    public double itemizeHamburger() {
        System.out.println("One order of " + name + " on " + breadRollType + " with " + addition1Name + " " + addition2Name + " " + addition3Name + " " + addition4Name);
        return (price + addition1Price + addition2Price + addition3Price + addition4Price);
    }

}
