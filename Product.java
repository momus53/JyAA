import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Product {

    private Integer batch;
    private String name;
    private Date productionDate;
    private Integer quantity;
    private ArrayList<String> observations;
    private List<Delivery> delivery;
    private Recipe recipe;

    // Constructor with all attributes
    public Product(Integer batch, String name, Date productionDate, Integer quantity, ArrayList<String> observations) {
        this.batch = batch;
        this.name = name;
        this.productionDate = productionDate;
        this.quantity = quantity;
        this.observations = observations;
        this.delivery = new ArrayList<>();

    }

    // Getters
    public Integer getBatch() {
        return batch;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public String getName() {
        return name;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public ArrayList<String> getObservations() {
        return new ArrayList<>(observations); 
    }

    public List<Delivery> getDeliverys() {
        return delivery;
    }

    // Setters
    public void setBatch(Integer batch) {
        this.batch = batch;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void addObservation(String observation) {
        observations.add(observation);
    }

    // Other methods (optional)
    public void removeObservation(String observation) {
        observations.remove(observation);
    }

    public void updateQuantity(int delta) {
        this.quantity += delta;
    }


    public void setDelivery(List<Delivery> delivery) {
        this.delivery = delivery;
    }


}
