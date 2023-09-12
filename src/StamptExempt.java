public enum StamptExempt {
    NONE(0.00),
    BRONCE(0.10),
    SILVER(0.15),
    GOLD(0.28);

    private final double stamptExempt;

    StamptExempt(double stamptExempt) {
        this.stamptExempt = stamptExempt;
    }

    public double getStamptExempt(){
        return stamptExempt;
    }
}
