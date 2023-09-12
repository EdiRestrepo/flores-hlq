import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private ArrayList<FlowerBouquet>  bouquets;
    private Store store;
    private double total;
    private double iva;

    public Invoice(Store store) {
        this.store = store;
        this.bouquets = new ArrayList<>();
    }

    public void addBouquets(FlowerBouquet flowerBouquet){
        bouquets.add(flowerBouquet);
    }

    public void calculateTotal(){
        total = 0.0;
        double stamptExempt = 0.0;
        for (FlowerBouquet bouquet : bouquets){
            total += bouquet.getPrice().getPrice();
            stamptExempt += bouquet.getStamptExempt().getStamptExempt();
        }

        total = total - (total * stamptExempt);
        double discount = total * store.getLocation().getLocation();
        total = total - discount;
        iva = total * 0.19;
        total = total + iva;
    }

    public void generateInvoice(){
        System.out.println("Factura de " + store.getName());
        System.out.println("Ubicación: " + store.getLocation());
        System.out.println("Facturación Electrónica: " + store.isElectronicInvoicing());
        System.out.println("Arreglos Florales:");

        for (FlowerBouquet bouquet : bouquets) {
            System.out.println("- " + bouquet.getNameFlower() + ": $" + bouquet.getPrice().getPrice());
        }

        System.out.println("Sellos de Exención:");

        for (FlowerBouquet bouquet : bouquets) {
            System.out.println("- " + bouquet.getStamptExempt() + ": " + (bouquet.getStamptExempt().getStamptExempt() * 100) + "%");
        }

        System.out.println("Descuento: " + (store.getLocation().getLocation() * 100) + "%");
        System.out.println("Total: $" + total);
        System.out.println("IVA: $" + iva);

    }
}
