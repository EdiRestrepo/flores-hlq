public enum PriceFlower {
    TULIPANES(180000),
    GIRASOLES(110000),
    ROSAS(90000),
    CLAVEL(170000),
    CAMALOTE(280000);

    private final double price;
    PriceFlower(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
