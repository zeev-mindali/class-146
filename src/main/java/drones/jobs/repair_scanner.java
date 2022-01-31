package drones.jobs;

import drones.beans.Drones;

import java.sql.Date;
import java.util.List;

public class repair_scanner implements Runnable{
    //two types of parameters
    //by val -> primitive types (String,boolean,int,double,float,etc...)->Stack
    //by ref -> instances -> heap

    private List<Drones> drones;
    private boolean isRunning;

    public repair_scanner(List<Drones> drones) {
        this.drones = drones;
        this.isRunning=true;
    }

    @Override
    public void run() {
        while(isRunning){
            for(Drones item:drones){
                if (!item.isPoped()){
                    //check date
                    item.getEta().before(new Date(System.currentTimeMillis())){
                        item.setPoped(true);
                        System.out.println("DRONE IS READY !!!!!\n====================\n"+item);
                        //anonymous thread
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                for (int counter = 0; counter < 3; counter++) {
                                    try{Thread.sleep(30_000);}catch (Exception e){}
                                    System.out.println("DUDE , THE DRONE IS READY !!!!!!!");
                                }
                            }
                        }).start();
                    }
                }
            }
            try {
                Thread.sleep(1000*60*60*24);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopScanner(){
        this.isRunning=false;
    }
}
