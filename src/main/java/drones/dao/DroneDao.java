package drones.dao;

import java.sql.Date;

public interface DroneDao {
    //crud
    boolean createDrone(int clientId, String manufactor, String model, Date eta, Date entered);
    boolean updateDrone(int clientId, String manufactor, String model, Date eta, Date entered,int id);

    void deleteDron(int id);

    void getAllDrones();
    void getDroneById(int id);


}
