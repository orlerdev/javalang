package section_six.inheritance;

public class bmw extends Car {
    private String name;
    private int numberOfGears;

    public bmw(int speed, String name, int numberOfGears) {
        super(speed, true, true);
        this.name = name;
        this.numberOfGears = numberOfGears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }
}
