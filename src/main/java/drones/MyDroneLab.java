package drones;

import drones.DB.ConnectionPool;
import drones.DB.DBmanager;
import drones.DB.DBtools;
import drones.DB.SQLexamples;
import drones.beans.Customer;
import drones.beans.Student;
import drones.dao.CustomerDao;
import drones.dbdao.Customer_mysql;
import drones.dbdao.Customer_postgres;


import java.sql.SQLException;

public class MyDroneLab {
    public static void main(String[] args) {
//        boolean allOK = DBtools.runQuery(DBmanager.CREATE_DB);
//        System.out.println("command run successfully: "+allOK);

//        boolean allOK = DBtools.runQuery(DBmanager.DROP_DB);
//        System.out.println("command run successfully: "+allOK);

        boolean allOK = DBtools.runQuery(DBmanager.CREATE_CUSTOMER_TABLE);
        System.out.println("command run successfully: "+allOK);

        allOK = DBtools.runQuery(DBmanager.CREATE_DRONES_TABLE);
        System.out.println("command run successfully: "+allOK);

        Customer customer = new Customer(7,"Yoav Hacmon....","050-724-4372","Karnei Shomron",true,true);

        CustomerDao dbCustomer = new Customer_mysql();
        //dbCustomer.addCustomer(customer);
        dbCustomer.updateCustomer(customer);

        //allOK = dbCustomer.addCustomer(customer);
        //dbCustomer.deleteCustomer(6);
        //System.out.println("command run successfully: "+allOK);
    }
}
