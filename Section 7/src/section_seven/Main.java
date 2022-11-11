package section_seven;

import section_seven.MasterChallenge.DeluxeBurger;
import section_seven.MasterChallenge.Hamburger;
import section_seven.MasterChallenge.HealthyBurger;
import section_seven.polymorphism.*;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "There's no plot here.";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats lot of people in the 1970's.";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over the Earth.";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try to escape a maze.";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe.";
    }
}

class ForgettableMovie extends Movie {
    public ForgettableMovie() {
        super("Forgettable Movie");
    }

    //No plot method defined for this class
}

public class Main {
    public static void main(String[] args) {
//        Dimensions dimensions = new Dimensions(20, 20, 5);
//        Case theCase = new Case("220B", "Dell", "240", dimensions);
//        Monitor theMonitor = new Monitor("AU43X", "Samsung", 43, new Resolution(4280, 3400));
//        Motherboard theMotherboard = new Motherboard("ROG", "Asus", 8, 12, "v2.44");
//
//        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//        thePC.powerUp();
//
//        StructureDetails structureDetails = new StructureDetails();
//        Measurements measurements = new Measurements(16, 20);
//        Furniture theFurniture = new Furniture(4, "Grey", 5, "Tan", 2, "Ebony");
//
//        LivingRoom theLivingRoom = new LivingRoom(structureDetails, theFurniture, measurements);
//        theLivingRoom.allTogether();
//
//        Wall wall1 = new Wall("West");
//        Wall wall2 = new Wall("East");
//        Wall wall3 = new Wall("South");
//        Wall wall4 = new Wall("North");
//        Ceiling ceiling = new Ceiling(12, 55);
//        Bed bed = new Bed("Modern", 4, 3, 2, 1);
//        Lamp lamp = new Lamp("Classic", false, 75);
//
//        Bedroom bedRoom = new Bedroom("Jared", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
//        bedRoom.getLamp().turnOn();
//
//        for (int i = 1; i < 11; i++) {
//            Movie movie = randomMovie();
//            assert movie != null;
//            System.out.println("Movie #" + i + ":" + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
//        }

//        Car car = new Car(4, "BMW");
//        System.out.println(car.startEngine());
//        System.out.println(car.accelerate());
//        System.out.println(car.brake());
//
//        BMW bmw = new BMW(4, "3 Series");
//        System.out.println(bmw.startEngine());
//        System.out.println(bmw.accelerate());
//        System.out.println(bmw.brake());
//
//        Mercedes mercedes = new Mercedes(8, "AMG");
//        System.out.println(mercedes.startEngine());
//        System.out.println(mercedes.accelerate());
//        System.out.println(mercedes.brake());
//
//        Tesla tesla = new Tesla(0, "Model S");
//        System.out.println(tesla.startEngine());
//        System.out.println(tesla.accelerate());
//        System.out.println(tesla.brake());
//
//        Ford ford = new Ford(8, "F-250: King Ranch");
//        System.out.println(ford.startEngine());
//        System.out.println(ford.accelerate());
//        System.out.println(ford.brake());

        Hamburger hamburger = new Hamburger("Basic", "Bison", 4.99, "Wheat");
        double price = hamburger.totalBurgerPrice();
        hamburger.addTopping1("Extra meat", 1.00);
        hamburger.addTopping2("Cheese", 0.50);
        hamburger.addTopping3("Jalapenos", 0.50);
        hamburger.addTopping4("Fried Egg", 1.99);
        System.out.println("Total price of a Basic with toppings = " + hamburger.totalBurgerPrice());

        HealthyBurger healthyBurger = new HealthyBurger("Grass", 50.99);
        healthyBurger.addHealthySpecial1("Sticks", 80.63);
        healthyBurger.addHealthySpecial2("Dirt", 30.24);
        System.out.println("Total price of a Healthy with toppings = " + "$" + healthyBurger.totalBurgerPrice());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.totalBurgerPrice();
        deluxeBurger.addTopping2("Carmalized Onions", 2.99);


    }

    public static Movie randomMovie() {
        //Adding 1 ensures that the value of 0 is never returned.
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new ForgettableMovie();
            default:
                return null;
        }

    }
}
