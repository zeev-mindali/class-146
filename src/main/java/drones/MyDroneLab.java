package drones;

import drones.DB.ConnectionPool;

import java.sql.SQLException;

public class MyDroneLab {
    public static void main(String[] args) {
        ConnectionPool cp1=null,cp2=null,cp3=null;
        //ConnectionPool cp = new ConnectionPool();
        try {
             cp1 = ConnectionPool.getInstance(); //here we created instance
             cp2 = ConnectionPool.getInstance(); //here we use existing instance
             cp3 = ConnectionPool.getInstance(); //here we use existing instance
        } catch (SQLException err) {
            System.out.println("SQL ERROR: "+err.getMessage());
        }

        cp1.showMeTheMoney();
        cp2.showMeTheMoney();
        cp3.showMeTheMoney();

        System.out.println(cp1);
        System.out.println(cp2);
        System.out.println(cp3);

    }
}
