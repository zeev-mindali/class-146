package air_port;

public class AirPlane implements Runnable{
    private static int id=1000;
    private static final Object COMMUNICATION = new Object();

    private int planeId;

    public AirPlane() {
        this.planeId=++id;
    }

    public void takeOff() throws InterruptedException {
        System.out.println("Plane id #"+this.planeId+" wants to take off");
        synchronized (COMMUNICATION){
            System.out.println("Plane id #"+this.planeId+" is taking off ......");
            Thread.sleep((int)(Math.random()*500)+500);
            System.out.println("Plane id #"+this.planeId+" is in the air ......");
        }
    }

    public void fly(){
        int flyTime = (int)(Math.random()*500)+500;
        System.out.println("Air plane #"+this.planeId+" in the air for "+flyTime);
        try {
            Thread.sleep(flyTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void land() throws InterruptedException {
        System.out.println("Plane id #"+this.planeId+" wants to land");
        synchronized (COMMUNICATION){
            System.out.println("Plane id #"+this.planeId+" is landing ......");
            Thread.sleep((int)(Math.random()*500)+500);
            System.out.println("Plane id #"+this.planeId+" is in the ground ......");
        }
    }

    @Override
    public void run() {
        try{
        takeOff();
        fly();
        land();
        } catch (InterruptedException err){
            System.out.println(err.getMessage());
        }

    }
}
