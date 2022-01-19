package thread;

public class MyRunnable implements Runnable{
    private char ch;

    public MyRunnable(char ch) {
        this.ch = ch;
    }

    @Override
    public void run() {
        for (int counter=0;counter<50;counter++){
            System.out.print(""+ch+counter+ch+"\t");
        }
        System.out.println();
    }
}
