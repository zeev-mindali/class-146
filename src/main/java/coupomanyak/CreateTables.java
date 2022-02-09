package coupomanyak;

import java.util.ArrayList;
import java.util.List;

public class CreateTables {
    public static final String companiesTable = "CREATE TABLE `your data base`.`companies` (" +
            "  `id` INT NOT NULL AUTO_INCREMENT," +
            "  `name` VARCHAR(45) NOT NULL," +
            "  `email` VARCHAR(45) NOT NULL," +
            "  `password` VARCHAR(45) NOT NULL," +
            "  PRIMARY KEY (`id`));";

    public static void main(String[] args) {
        List<Coupon> myList = new ArrayList<>();
        myList.add(new Coupon("zeev","Zeevik for sale","john bryce","19/02/2022","19/03/2022",10,100.50));
        myList.add(new Coupon("golan","bla bla bla","john bryce","29/03/2022","29/04/2022",10,99.99));
        myList.add(new Coupon("Saar","bla bla bla","john bryce","08/05/2022","08/06/2022",10,99.90));
        myList.add(new Coupon("Saar","bla bla bla","john bryce","19/08/2022","19/09/2022",10,100.52));
        myList.add(new Coupon("oren","bla bla bla","john bryce","05/01/2022","05/03/2022",10,50.50));
        myList.add(new Coupon("Lea","bla bla bla","john bryce","12/02/2022","12/06/2022",10,70));
        myList.add(new Coupon("shacher","bla bla bla","john bryce","17/04/2022","17/05/2022",10,120.00));
        myList.add(new Coupon("geri","bla bla bla","john bryce","21/09/2022","21/10/2022",10,200.00));
        myList.add(new Coupon("Shriker","bla bla bla","john bryce","31/01/2022","31/04/2022",10,110.00));
        myList.add(new Coupon("Tal","bla bla bla","john bryce","30/05/2022","30/12/2022",10,1540.00));
        myList.add(new Coupon("Yoav","bla bla bla","john bryce","11/12/2022","11/01/2023",10,140.00));

        //myList.forEach(System.out::println);
        TablePrinter.print(myList);
    }
}
