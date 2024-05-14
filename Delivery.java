import java.util.Date;

public class Delivery {

    private String id;
    private Integer stock;
    private Product product;
    private Date deliverDate;
    private SalesChannel channel;

    // Constructor
    public Delivery(String id, Integer stock, Product producto, Date deliverDate, SalesChannel channel) {
        this.id = id;
        this.stock = stock;
        this.product = producto;
        this.deliverDate = deliverDate;
        this.channel = channel;
    }

    // Getters
    public String getId() {
        return id;
    }

    public Integer getStock() {
        return stock;
    }

    public Product getProducto() {
        return product;
    }

    public Date getDeliverDate() {
        return deliverDate;
    }

    public SalesChannel getChannel() {
        return channel;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setProducto(Product producto) {
        this.product = producto;
    }

    public void setDeliverDate(Date deliverDate) {
        this.deliverDate = deliverDate;
    }

    public void setChannel(SalesChannel channel) {
        this.channel = channel;
    }
}