package advanced_oop.air_port;

public class Airport {
    private final static int TOTAL_PLANES = 10;
    private Thread[] planes = new Thread[TOTAL_PLANES];
    private AirPlane[] airPlanes = new AirPlane[TOTAL_PLANES];
    private String name;

    public Airport(String name) {
        this.name = name;
    }

    public void startActivity(){
        //open the air port
        System.out.println("Air port "+this.name+" is open for business");
        //create planes
        for (int counter = 0; counter < TOTAL_PLANES; counter++) {
           this.airPlanes[counter] = new AirPlane();
           //convert it to advanced_oop.thread.....
            this.planes[counter] = new Thread(airPlanes[counter]);
        }
        //start the engine
        for(Thread item:planes){
            item.start();
        }
        //join the planes to the airport
        for (Thread item:planes){
            try {
                item.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //close the airport
        System.out.println("Closing "+this.name+" airport");
    }
}
