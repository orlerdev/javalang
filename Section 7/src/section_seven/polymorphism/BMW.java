package section_seven.polymorphism;

public class BMW extends Car {
    public BMW(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        //Alternative method for retrieving the class name
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}
