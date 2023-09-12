public enum Location {
    NORTH(0.0173),
    SOUTH(0.0122),
    ;

    private final double location;
    Location(double location) {
        this.location = location;
    }
    public double getLocation() {
        return location;
    }
}
