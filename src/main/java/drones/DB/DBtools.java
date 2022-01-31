package drones.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBtools {
    public static boolean runQuery(String sql)  {
        //use connection from connection sql to send queries to our db
        Connection connection = null;
        try{
            //get a connection for connection pool
            connection = ConnectionPool.getInstance().getConnection();

            //prepare our sql (string) and convert it to a language that mysql will understand
            PreparedStatement statement = connection.prepareStatement(sql);

            //run statement
            statement.execute();

            return true;
        } catch (InterruptedException | SQLException err) {
            System.out.println(err.getMessage());
            return false;
        } finally {
            ConnectionPool.getInstance().returnConnection(connection);
        }
    }
}
