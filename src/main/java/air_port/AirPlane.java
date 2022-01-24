package air_port;

import java.util.Random;

public class AirPlane implements Runnable{
    private static int id=1000;
    private static final Object mutex = new Object();

    private int planeId;

    public AirPlane() {
        this.planeId=++id;
    }

    public void takeOff(){
        System.out.println("Plane id #"+this.planeId+" is taking off....");
    }

    public void fly(){
        int flyTime = (int)(Math.random()*1000)+1000;
        System.out.println("Air plane #"+this.planeId+" in the air for "+flyTime);
        try {
            Thread.sleep(flyTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void land(){
        System.out.println("Plane id #"+this.planeId+" is Landing....");
    }

    @Override
    public void run() {
        //critical method
        synchronized (mutex) {
            takeOff();
        }

        //normal method....
        fly();

        //critical method
        synchronized (mutex) {
            land();
        }
    }
}
