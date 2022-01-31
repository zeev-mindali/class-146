package drones.dbdao;

import drones.DB.DBmanager;
import drones.DB.DBtools;
import drones.beans.Customer;
import drones.dao.CustomerDao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer_postgres implements CustomerDao {
    @Override
    public boolean addCustomer(Customer customer) {
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

    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return false;
    }

    @Override
    public List<Customer> getCustomers(String sql, Map<Integer, Object> values) {
        return null;
    }


}
