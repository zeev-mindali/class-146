package drones.DB;

import drones.beans.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLexamples {
    private static final String ADD_STUDENT = "INSERT INTO `class146`.`student` " +
            "(name,phone,city,course,age) " +
            "VALUES (?,?,?,?,?)";

    private static final String DELETE_STUDENT_BY_ID = "" +
            "DELETE FROM `class146`.`student` WHERE id=?";

    /*
     ██████╗    ██████╗     ██╗   ██╗    ██████╗
    ██╔════╝    ██╔══██╗    ██║   ██║    ██╔══██╗
    ██║         ██████╔╝    ██║   ██║    ██║  ██║
    ██║         ██╔══██╗    ██║   ██║    ██║  ██║
    ╚██████╗    ██║  ██║    ╚██████╔╝    ██████╔╝
     ╚═════╝    ╚═╝  ╚═╝     ╚═════╝     ╚═════╝
     */

    //CREATE
    public static boolean addStudent(Student student){
        //get connection
        Connection connection = null;
        try {
            //get connection
            connection = ConnectionPool.getInstance().getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(ADD_STUDENT);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2,student.getPhone());
            preparedStatement.setString(3,student.getCity());
            preparedStatement.setString(4,student.getCourse());
            preparedStatement.setInt(5,student.getAge());

            preparedStatement.execute();
            return true;
        } catch (InterruptedException | SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            ConnectionPool.getInstance().returnConnection(connection);
        }
    }

    //DELETE...
    public static void deleteById(int id){
        Connection connection = null;

        try {
            connection = ConnectionPool.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(DELETE_STUDENT_BY_ID);
            statement.setInt(1,id);
            statement.execute();
        } catch (InterruptedException | SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionPool.getInstance().returnConnection(connection);
        }
    }

}
