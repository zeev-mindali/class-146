package drones.dao;

import drones.beans.Customer;

import java.util.List;

public interface CustomerDao {
    //CRUD -> Create Read Update Delete
    boolean addCustomer(Customer customer);
    void deleteCustomer(int id);
    boolean updateCustomer(Customer customer);

    List<Customer> getAllCustomers();
    Customer getCustomerById(int id);
}
