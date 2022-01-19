package thread;

public class Tester {
    public static void main_old(String[] args) {
        MyThread myThread1 = new MyThread('#');
        MyThread myThread2 = new MyThread('-');

        //myThread1.run(); //run -> sync
        //myThread2.run(); //run -> sync

//        myThread1.start(); //start -> async
//        myThread2.start(); //start -> async
//        System.out.println("Me finished !!!!");


//        //create instance of "thread"
//        MyRunnable myRun1 = new MyRunnable('-');
//        MyRunnable myRun2 = new MyRunnable('#');

        //convert my Runnable into A thread
//        Thread myThread3 = new Thread(myRun1);
//        Thread myThread4 = new Thread(myRun2);
//
//        myThread3.start();
//        myThread4.start();
//        System.out.println("Me finished !!!!!");
        /*
        MySimpleRunnable mySimpleRunnable = new MySimpleRunnable();
        Thread mySimpleThread = new Thread(mySimpleRunnable);
        mySimpleThread.start();
        */

        /*
        Thread myShortThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Check for update :)");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("No update for you today !!!");
            }
        });
        myShortThread.start();

        //anonymous thread
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Check if omer in the house");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Omer not in the house, moving to next victim");
            }
        }).start();
         */
    }

    public static void main(String[] args) throws InterruptedException {
        MyRunnable run1 = new MyRunnable('-');
        MyRunnable run2 = new MyRunnable('+');

        //Thread thread1 = new Thread(run1);
        //Thread thread2 = new Thread(run2);

        Thread[] myThread = {new Thread(run1),
                new Thread(run1),
                new Thread(run1),
                new Thread(run1),
                new Thread(run1),
                new Thread(run1),
                new Thread(run1),
                new Thread(run1),
                new Thread(run1),
                new Thread(run2)};

        //start all threads
        for (Thread item:myThread){
            item.start();
        }

        //make join to all threads
        for (Thread item:myThread){
            item.join();
        }

        myThread[5].interrupt();
        //thread2.start();

        /*
        try {
            thread1.join();
            //thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        */

        //-------
        System.out.println("Me finished, Happy Happy , Joy Joy");
    }
}
