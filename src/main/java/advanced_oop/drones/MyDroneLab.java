package advanced_oop.drones;

import advanced_oop.drones.DB.ConnectionPool;
import advanced_oop.drones.DB.SQLexamples;

public class MyDroneLab {
    public static void main(String[] args) {
        ConnectionPool cp1 = null, cp2 = null, cp3 = null;
        //ConnectionPool cp = new ConnectionPool();

        cp1 = ConnectionPool.getInstance(); //here we created instance
        cp2 = ConnectionPool.getInstance(); //here we use existing instance
        cp3 = ConnectionPool.getInstance(); //here we use existing instance


        /*
        cp1.showMeTheMoney();
        cp2.showMeTheMoney();
        cp3.showMeTheMoney();

        System.out.println(cp1);
        System.out.println(cp2);
        System.out.println(cp3);
        */

        /*
        try {
            DBtools.runQuery("INSERT INTO student (name,phone,city,course) VALUES ('Guy','052-111-2222','Kadima', 'full stack java')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */

        //Student student = new Student(0,"Geri G.","050-123-6543","Ramat ha golan","Java Full Stack",37);
        //System.out.println("all is ok? "+SQLexamples.addStudent(student));
        SQLexamples.deleteById(15);
        SQLexamples.deleteById(16);


        try {
            ConnectionPool.getInstance().closeAllConnection();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
