public class Property {

    // Attributes
    private int yearOfConstruction;
    private String propertyCategory;
    private String address;
    private String neighborhood;
    private String spaces;
    private String level;
    private String energyClass;
    private String orientation;
    private String heating;
    private String buildingBills;
    private float structureFactor;
    private float coverFactor;
    private String electricalCurrentPhase;
    private boolean urbanPlan;
    private String landUseCategory;
    private float area;
    private boolean available;

    public Property(int yearOfConstruction, String propertyCategory, String address, String neighborhood, String spaces, String level, String energyClass, String orientation, String heating, String buildingBills, float structureFactor, float coverFactor, String electricalCurrentPhase, boolean urbanPlan, String landUseCategory, float area, boolean available){
        this.yearOfConstruction = yearOfConstruction;
        this.propertyCategory = propertyCategory;
        this.address = address;
        this.neighborhood = neighborhood;
        this.spaces = spaces;
        this.level = level;
        this.energyClass = energyClass;
        this.orientation = orientation;
        this.heating = heating;
        this.buildingBills = buildingBills;
        this.structureFactor = structureFactor;
        this.coverFactor = coverFactor;
        this.electricalCurrentPhase = electricalCurrentPhase;
        this.urbanPlan = urbanPlan;
        this.landUseCategory = landUseCategory;
        this.area = area;
        this.available = available;
    } // Constructor

    // Methods
}
