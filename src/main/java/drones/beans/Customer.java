package drones.beans;

public class Customer {
    private int id;
    private String name;
    private String phone;
    private String city;
    private boolean vip;
    private boolean urgent;

    public Customer(int id, String name, String phone, String city, boolean vip, boolean urgent) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.city = city;
        this.vip = vip;
        this.urgent = urgent;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }
}
