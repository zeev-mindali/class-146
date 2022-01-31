package drones.dbdao;

import drones.DB.ConnectionPool;
import drones.DB.DBmanager;
import drones.DB.DBtools;
import drones.beans.Customer;
import drones.dao.CustomerDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Customer_mysql implements CustomerDao {
    @Override
    public boolean addCustomer(Customer customer) {
        //Omer yesterday
        /*
        Connection connection = null;
        try {
            connection = ConnectionPool.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(DBmanager.CREATE_NEW_CUSTOMER);

            preparedStatement.setString(1,customer.getName());
            preparedStatement.setString(2,customer.getPhone());
            preparedStatement.setString(3, customer.getCity());
            preparedStatement.setBoolean(4,customer.isVip());
            preparedStatement.setBoolean(5,customer.isUrgent());

            preparedStatement.execute();

            return true;
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionPool.getInstance().returnConnection(connection);
        }
        return false;
        */

        //Omer today
        Map<Integer, Object> values = new HashMap<>();
        values.put(1,customer.getName());
        values.put(2,customer.getPhone());
        values.put(3,customer.getCity());
        values.put(4,customer.isVip());
        values.put(5,customer.isUrgent());

        return DBtools.runQuery(DBmanager.CREATE_NEW_CUSTOMER,values);
    }

    @Override
    public void deleteCustomer(int id) {
        Map<Integer, Object> values = new HashMap<>();
        values.put(1,id);
        DBtools.runQuery(DBmanager.DELETE_CUSTOMER,values);
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        Map<Integer, Object> values = new HashMap<>();
        values.put(1,customer.getName());
        values.put(2,customer.getPhone());
        values.put(3,customer.getCity());
        values.put(4,customer.isVip());
        values.put(5,customer.isUrgent());
        values.put(6,customer.getId());

        return DBtools.runQuery(DBmanager.UPDATE_CUSTOMER,values);
    }

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        ResultSet resultSet = DBtools.runQueryForResult(DBmanager.GET_ALL_CUSTOMER);
        try {
            while (resultSet.next()) {
                Customer customer = new Customer(

                );
                customers.add(customer);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return customers;
    }

    @Override
    public Customer getCustomerById(int id) {

        return null;
    }
}
