import java.util.Date;

public class Resource {

    private String id;
    private String name;
    private double price;
    private double quantity;
    private String unit;
    private Date enteredAt;
    private Date createdAt;
    private ResourceGroup group;
    private ProducingFamily origin;

    // Constructor with all attributes
    public Resource(String id, String name, double price, double quantity, String unit, Date enteredAt, Date createdAt, ResourceGroup group, ProducingFamily origin) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
        this.enteredAt = enteredAt;
        this.createdAt = createdAt;
        this.group = group;
        this.origin = origin;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    public Date getEnteredAt() {
        return enteredAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public ResourceGroup getGroup() {
        return group;
    }

    public ProducingFamily getOrigin() {
        return origin;
    }
    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setEnteredAt(Date enteredAt) {
        this.enteredAt = enteredAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setGroup(ResourceGroup group) {
        this.group = group;
    }
    
    public void setOrigin(ProducingFamily origin) {
        this.origin = origin;
    }

    public void updateQuantity(double delta) {
        this.quantity += delta;
        System.out.println("Resource quantity updated: " + name + ", new quantity: " + quantity);
    }

    public void reduceQuantity(double quantity) {
        if (quantity <= this.quantity) {
            this.quantity -= quantity;
            System.out.println("Resource quantity reduced: " + name + ", remaining quantity: " + this.quantity);
        } else {
            System.out.println("Insufficient resource quantity: " + name + ", requested: " + quantity + ", available: " + this.quantity);
        }
    }

}
