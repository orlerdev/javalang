package section_seven.composition.challenges;

public class Furniture {
    private int couches;
    private String couchColor;
    private int chairs;
    private String chairColor;
    private int tables;
    private String tablesColor;

    public Furniture(int couches, String couchColor, int chairs, String chairColor, int tables, String tablesColor) {
        this.couches = couches;
        this.couchColor = couchColor;
        this.chairs = chairs;
        this.chairColor = chairColor;
        this.tables = tables;
        this.tablesColor = tablesColor;
    }

    public int totalPieces() {
        return couches + chairs + tables;
    }

    public int getCouches() {
        return couches;
    }

    public String getCouchColor() {
        return couchColor;
    }

    public int getChairs() {
        return chairs;
    }

    public String getChairColor() {
        return chairColor;
    }

    public int getTables() {
        return tables;
    }

    public String getTablesColor() {
        return tablesColor;
    }
}
