package drones;

import drones.DB.ConnectionPool;
import drones.DB.DBmanager;
import drones.DB.DBtools;
import drones.DB.SQLexamples;
import drones.beans.Student;


import java.sql.SQLException;

public class MyDroneLab {
    public static void main(String[] args) {
//        boolean allOK = DBtools.runQuery(DBmanager.CREATE_DB);
//        System.out.println("command run successfully: "+allOK);

//        boolean allOK = DBtools.runQuery(DBmanager.DROP_DB);
//        System.out.println("command run successfully: "+allOK);

        boolean allOK = DBtools.runQuery(DBmanager.CREATE_CUSTOMER_TABLE);
        System.out.println("command run successfully: "+allOK);

        allOK = DBtools.runQuery(DBmanager.CREATE_DRONES_TABLE);
        System.out.println("command run successfully: "+allOK);

    }
}
