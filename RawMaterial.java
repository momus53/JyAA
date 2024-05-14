import java.util.Date;

public class RawMaterial extends Resource {

    private boolean canFreeze;
    private boolean prepare;
    private Date expiredAt;

    // Constructor with all attributes (including parent class attributes)
    public RawMaterial(String id, String name, double price, double quantity, String unit, ResourceGroup group, ProducingFamily origin , Date enteredAt, Date createdAt, boolean canFreeze, boolean prepare, Date expiredAt) {
        super(id, name, price, quantity, unit, enteredAt, createdAt, group, origin);
        this.canFreeze = canFreeze;
        this.prepare = prepare;
        this.expiredAt = expiredAt;
    }

    // Getters

    public boolean isCanFreeze() {
        return canFreeze;
    }

    public boolean isPrepare() {
        return prepare;
    }

    public Date getExpiredAt() {
        return expiredAt;
    }

    // Setters

    public void setCanFreeze(boolean canFreeze) {
        this.canFreeze = canFreeze;
    }

    public void setPrepare(boolean prepare) {
        this.prepare = prepare;
    }

    public void setExpiredAt(Date expiredAt) {
        this.expiredAt = expiredAt;
    }

    public void checkExpiration() {
        if (expiredAt != null && expiredAt.before(new Date())) {
            System.out.println("WARNING: Raw material " + getName() + " is expired.");
        }
    }

}

