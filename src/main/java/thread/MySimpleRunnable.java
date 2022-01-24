package thread;

public class MySimpleRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Check for update :)");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("No update for you today !!!");
    }
}
