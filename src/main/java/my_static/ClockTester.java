package my_static;

public class ClockTester {
    public static void main(String[] args) {
        Clock myClock = new Clock(16,0);
        System.out.println(myClock);
        Clock.setFormat(false);
        System.out.println(myClock);
        Clock.setFormat(true);
        System.out.println(myClock);
    }
}
