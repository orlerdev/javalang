package section_seven.composition.challenges;

public class StructureDetails {
    private int windows;
    private int doors;
    private int walls;

    public StructureDetails() {
        this(4, 2, 4);
    }

    public StructureDetails(int windows, int doors, int walls) {
        this.windows = windows;
        this.doors = doors;
        this.walls = walls;
    }

    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    public int getWalls() {
        return walls;
    }
}
