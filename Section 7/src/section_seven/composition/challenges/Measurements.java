package section_seven.composition.challenges;

public class Measurements {
    private double width;
    private double length;

    public Measurements(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public void squareFeet(double width, double length) {
        System.out.println("The square footage is " + width + " feet by " + length + " feet");
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
