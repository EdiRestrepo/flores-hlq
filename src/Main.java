public class Main {

    public static void main(String[] args) {
        // Crear arreglos florales
        FlowerBouquet tulipanes = new FlowerBouquet(Flower.TULIPANES, PriceFlower.TULIPANES, StamptExempt.BRONCE);
        FlowerBouquet girasoles = new FlowerBouquet(Flower.GIRASOLES, PriceFlower.GIRASOLES, StamptExempt.GOLD);
        FlowerBouquet rosas = new FlowerBouquet(Flower.ROSAS, PriceFlower.ROSAS, StamptExempt.NONE);
        FlowerBouquet clavel = new FlowerBouquet(Flower.CLAVEL, PriceFlower.CLAVEL, StamptExempt.GOLD);
        FlowerBouquet camalote = new FlowerBouquet(Flower.CAMALOTE, PriceFlower.CAMALOTE, StamptExempt.SILVER);

        // Crear tiendas
        Store tiendaNorte = new Store("HLQ Norte", Location.NORTH, true);
        Store tiendaSur = new Store("HLQ Sur", Location.SOUTH, false);

        // Crear facturas
        Invoice facturaNorte = new Invoice(tiendaNorte);
        facturaNorte.addBouquets(tulipanes);
        facturaNorte.addBouquets(rosas);
        facturaNorte.calculateTotal();
        facturaNorte.generateInvoice();

        System.out.println("********************************");
        System.out.println("********************************");
        Invoice facturaSur = new Invoice(tiendaSur);
        facturaSur.addBouquets(girasoles);
        facturaSur.addBouquets(camalote);
        facturaSur.calculateTotal();
        facturaSur.generateInvoice();
    }
}