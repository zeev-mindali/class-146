package advanced_oop.drones.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Stack;

public class ConnectionPool {
    //number of connection to sql (maximum is 20,default is 10)
    private static final int NUMBER_OF_CONNECTIONS=10;
    private static ConnectionPool instance=null;
    private final Stack<Connection> connections = new Stack<>();

    private ConnectionPool() throws SQLException {
        System.out.println("Me created new instace....");
        openAllConnections();
    }

    private void openAllConnections() throws SQLException {
        for (int counter = 0; counter < NUMBER_OF_CONNECTIONS; counter++) {
            //create CONNECTION
            Connection connection = DriverManager.getConnection(DBmanager.URL,DBmanager.SQL_USER,DBmanager.SQL_PASS);
            //push the new connection into the stack....
            connections.push(connection);
        }
    }

    public void closeAllConnection() throws InterruptedException{
        synchronized (connections){
            while(connections.size()<NUMBER_OF_CONNECTIONS){
                connections.wait();
            }
            connections.removeAllElements();
        }
    }

    public static ConnectionPool getInstance()  {
        //first we check that instance is null
        if (instance==null){
            //syncronized-critical code , that another advanced_oop.thread will not pass here
            synchronized (ConnectionPool.class){
                //double check, that no other advanced_oop.thread create an instance.....
                if (instance==null){
                    try {
                        instance = new ConnectionPool();
                    } catch (SQLException err) {
                        System.out.println(err.getMessage());
                    }
                }
            }
        }
        return instance;
    }

    /*
    public static ConnectionPool getInstanceBad() throws SQLException {
        if (instance==null){
            instance = new ConnectionPool();
        }
        return instance;
    }
    */

    public void showMeTheMoney(){
        System.out.println("$$$$$$$$$$$$");
    }

    public Connection getConnection() throws InterruptedException{
        synchronized (connections){
            if (connections.isEmpty()){
                //wait until we will get a connection back
                connections.wait();
            }
            return connections.pop();
        }
    }

    public void returnConnection(Connection connection){
        synchronized (connections){
            connections.push(connection);
            //notify that we got back a connection from the user...
            connections.notify();
        }
    }
}
