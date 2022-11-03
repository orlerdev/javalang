package section_six;

public class Account {
    private long number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public Account() {
        // This creates default values for the object fields
        this(000001, 00.00, "Customer Name", "Customer Email", "Customer Phone Number");
        System.out.println("Empty constructor called");
    }

    public Account(long number, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmail, String customerPhoneNumber) {
        // Created using generate option from Code menu
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerEmail, String customerPhoneNumber) {
        this(234523344, 785.54,"Howard Hughes", customerEmail, customerPhoneNumber);
        // Created using generate option from Code menu
        // The first three fields are manually entered
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Your account balance is " + balance);
        } else {
            System.out.println("Please enter the amount you would like to deposit.");
        }
    }

    public void withdrawl(double amount) {
        if (balance > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Your new account balance is " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }

    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

}
