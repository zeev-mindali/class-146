package drones.dao;

import drones.beans.Drones;

import java.sql.Date;

public interface DroneDao {
    //merage createDrone and update drone into one single method
    boolean createDrone(Drones drone);
    boolean updateDrone(Drones drone);

    void deleteDrone(int id);

    void getAllDrones();



}
