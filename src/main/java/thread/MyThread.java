package thread;

public class MyThread extends Thread {
    private char ch;

    public MyThread(char ch) {
        //parent default ctor
        this.ch = ch;
    }

    @Override
    public void run() {
        run1();
        run2();
        run3();
    }

    private void run1() {
        System.out.println("Hello Yoav");
    }

    private void run2() {
        for (int counter = 0; counter < 50; counter++) {
            System.out.print("" + ch + counter + ch + "\t");
        }
        System.out.println();
    }

    private void run3() {
        System.out.println("Goodbye Yoav");
    }
}
