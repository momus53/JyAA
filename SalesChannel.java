import java.util.ArrayList;
import java.util.List;

public class SalesChannel {

    private String name;
    private List<Delivery> delivery;

    // Constructor
    public SalesChannel(String name) {
        this.name = name;
        this.delivery = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<Delivery> getDeliverys() {
        return delivery;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDelivery(List<Delivery> delivery) {
        this.delivery = delivery;
    }
}