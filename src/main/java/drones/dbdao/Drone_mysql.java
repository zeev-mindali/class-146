package drones.dbdao;

import drones.DB.DBmanager;
import drones.DB.DBtools;
import drones.beans.Drones;
import drones.dao.DroneDao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Drone_mysql implements DroneDao {
    @Override
    public boolean createDrone(Drones drone) {
        Map<Integer, Object> values = new HashMap<>();
        values.put(1,drone.getClientId());
        values.put(2,drone.getManufactor());
        values.put(3,drone.getModel());
        values.put(4,drone.getEta());
        values.put(5,drone.getEntered());

        return DBtools.runQuery(DBmanager.CREATE_DRONE,values);


    }

    @Override
    public boolean updateDrone(Drones drone) {
        return false;
    }


    @Override
    public void deleteDrone(int id) {

    }

    @Override
    public Set<Drones> getAllDrones() {
        //create a comperator
        Set<Drones> drones = new TreeSet<>();
        return null;
    }
}
