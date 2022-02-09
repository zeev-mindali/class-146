package advanced_oop.drones.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DailyJob implements Runnable{
    private boolean quit=false;
    @Override
    public void run() {
        while (!quit){
            String sqlDelete = "DELETE FROM coupons WHERE=";
            try {
                Connection connection = ConnectionPool.getInstance().getConnection();
                PreparedStatement statement = connection.prepareStatement(sqlDelete);
                statement.execute();
                Thread.sleep(1000*60*60*24);
            } catch (InterruptedException | SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void stop(){
        quit=true;
    }
}
