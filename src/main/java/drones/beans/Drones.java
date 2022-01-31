package drones.beans;

import java.sql.Date;

public class Drones {
    private int id;
    private int clientId;
    private String manufactor;
    private String model;
    private Date eta;
    private Date entered;
    private boolean isPoped;

    public Drones(int id, int clientId, String manufactor, String model, Date eta, Date entered) {
        this.id = id;
        this.clientId = clientId;
        this.manufactor = manufactor;
        this.model = model;
        this.eta = eta;
        this.entered = entered;
        this.isPoped=false;
    }

    public Drones() {
    }

    public int getId() {
        return id;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getEta() {
        return eta;
    }

    public void setEta(Date eta) {
        this.eta = eta;
    }

    public Date getEntered() {
        return entered;
    }

    public void setEntered(Date entered) {
        this.entered = entered;
    }

    @Override
    public String toString() {
        return "Drones{" +
                "id=" + id +
                ", clientId=" + clientId +
                ", manufactor='" + manufactor + '\'' +
                ", model='" + model + '\'' +
                ", eta=" + eta +
                ", entered=" + entered +
                '}';
    }

    public boolean isPoped() {
        return isPoped;
    }

    public void setPoped(boolean poped) {
        isPoped = poped;
    }
}
