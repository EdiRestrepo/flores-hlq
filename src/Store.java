import java.util.List;
import java.util.Objects;

public class Store {

    private String name;
    private Location location;

    private boolean electronicInvoicing;

    public Store(String name, Location location, boolean electronicInvoicing) {
        this.name = name;
        this.location = location;
        this.electronicInvoicing = electronicInvoicing;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public boolean isElectronicInvoicing() {
        return electronicInvoicing;
    }
}
