package drones.dbdao;

import drones.dao.CustomerDao;

public class Customer_mysql implements CustomerDao {
    @Override
    public boolean addCustomer(String name, String phone, String city, boolean vip, boolean urgent) {
        return false;
    }

    @Override
    public void deleteCustomer(int id) {

    }

    @Override
    public boolean updateCustomer(String name, String phone, String city, boolean vip, boolean urgent, int id) {
        return false;
    }

    @Override
    public void getAllCustomers() {

    }

    @Override
    public void getCustomerById(int id) {

    }
}
