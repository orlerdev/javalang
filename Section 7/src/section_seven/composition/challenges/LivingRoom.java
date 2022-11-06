package section_seven.composition.challenges;

public class LivingRoom {
    private StructureDetails structureDetails;
    private Furniture theFurniture;
    private Measurements measurements;

    public LivingRoom(StructureDetails structureDetails, Furniture theFurniture, Measurements measurements) {
        this.structureDetails = structureDetails;
        this.theFurniture = theFurniture;
        this.measurements = measurements;
    }

    public void allTogether() {
        System.out.println("Here are the details of the living room: ");
        measurements.squareFeet(16, 20);
        roomDetails();
    }

    private void roomDetails() {
        System.out.println("The room has " + theFurniture.totalPieces() + " pieces of furniture, " + structureDetails.getWalls() + " walls, " + structureDetails.getDoors() + " doors, and " + structureDetails.getWindows() + " windows");
    }
}
