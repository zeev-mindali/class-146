package coupomanyak;

public class Coupon {
    private String couponName;
    private String description;
    private String couponCompany;
    private String issued;
    private String exparied;
    private int amount;
    private double price;

    public Coupon(String couponName, String description, String couponCompany, String issued, String exparied, int amount, double price) {
        this.couponName = couponName;
        this.description = description;
        this.couponCompany = couponCompany;
        this.issued = issued;
        this.exparied = exparied;
        this.amount = amount;
        this.price = price;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCouponCompany() {
        return couponCompany;
    }

    public void setCouponCompany(String couponCompany) {
        this.couponCompany = couponCompany;
    }

    public String getIssued() {
        return issued;
    }

    public void setIssued(String issued) {
        this.issued = issued;
    }

    public String getExparied() {
        return exparied;
    }

    public void setExparied(String exparied) {
        this.exparied = exparied;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "couponName='" + couponName + '\'' +
                ", description='" + description + '\'' +
                ", couponCompany='" + couponCompany + '\'' +
                ", issued='" + issued + '\'' +
                ", exparied='" + exparied + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}
