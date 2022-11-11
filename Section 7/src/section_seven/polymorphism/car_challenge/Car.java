package section_seven.polymorphism.car_challenge;

public class Car {
    private int cylinders;
    private String name;
    private int wheels;
    private boolean engine;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car ->brake()";
    }

}
