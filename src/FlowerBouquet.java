public class FlowerBouquet {
    private Flower nameFlower;
    private PriceFlower price;
    private StamptExempt stamptExempt;

    public FlowerBouquet(Flower nameFlower, PriceFlower price, StamptExempt stamptExempt) {
        this.nameFlower = nameFlower;
        this.price = price;
        this.stamptExempt = stamptExempt;
    }

    public Flower getNameFlower() {
        return nameFlower;
    }

    public PriceFlower getPrice() {
        return price;
    }

    public StamptExempt getStamptExempt() {
        return stamptExempt;
    }
}
