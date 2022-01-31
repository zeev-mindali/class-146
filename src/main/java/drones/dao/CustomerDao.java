package drones.dao;

public interface CustomerDao {
    //CRUD -> Create Read Update Delete
    boolean addCustomer(String name, String phone, String city, boolean vip, boolean urgent);
    void deleteCustomer(int id);
    boolean updateCustomer(String name, String phone, String city, boolean vip, boolean urgent,int id);

    void getAllCustomers();
    void getCustomerById(int id);
}
