package section_six.inheritance;

public class Car extends Vehicle {
    private boolean handSteering;
    private boolean changeGears;

    public Car() {

    }

    public Car(int speed, boolean handSteering, boolean changeGears) {
        super(speed);
        this.handSteering = handSteering;
        this.changeGears = changeGears;
    }

    public boolean isHandSteering() {
        return handSteering;
    }

    public void setHandSteering(boolean handSteering) {
        this.handSteering = handSteering;
    }

    public boolean isChangeGears() {
        return changeGears;
    }

    public void setChangeGears(boolean changeGears) {
        this.changeGears = changeGears;
    }
}
