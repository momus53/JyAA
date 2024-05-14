import java.util.Date;

public class Log {

    private Integer id;
    private Date date;
    private String details;
    private Product product;

    // Constructor with all attributes
    public Log(Integer id, Date date, String details, Product product) {
        this.id = id;
        this.date = date;
        this.details = details;
        this.product = product;
    }

    // Getters
    public Integer getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getDetails() {
        return details;
    }

    public Product getProduct() {
        return product;
    }

    // Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
