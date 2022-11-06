package section_six;

import section_six.classes.VipCustomer;
import section_six.inheritance.Animal;
import section_six.inheritance.Dog;

public class Main {
    public static void main(String[] args) {
//        Car porsche = new Car();
//        Car bmw = new Car();
//        bmw.setModel("3 Series");
//        System.out.println("Model is " + bmw.getModel());
//        porsche.setModel("gts3");
//        System.out.println("Model is " + porsche.getModel());

//        Account blankAccount = new Account();
//
//        Account myAccount = new Account(223442234, 100.00, "Jared Orler", "dev@dev.com", "555-555-5555");
//
//        Account myConstructedAccount = new Account(223442235, 1000000.00, "John Wick", "johnwick@email.com", "555-555-5555");
//
//        System.out.println(blankAccount.getCustomerName());
//        System.out.println(myConstructedAccount.getCustomerName() + " has a balance of $" + myConstructedAccount.getBalance());
//        System.out.println(myAccount.getCustomerName() + " has a balance of $" + myAccount.getBalance());
//
//        Account practiceAccount = new Account("donaldDuck@email.com", "234-432-4444");
//        System.out.println(practiceAccount.getCustomerName() + " " + practiceAccount.getBalance());

//        VipCustomer myVip = new VipCustomer("Henry", "johnson@gmail.com");
//        System.out.println(myVip.getCreditLimit() + " " + myVip.getName() + " " + myVip.getEmailAddress());

        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Husky", 10, 55, 2, 4, 1, 32, "double insulated");

        dog.eat();
        dog.walk();
        dog.run();
    }

}
