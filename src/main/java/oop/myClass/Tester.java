package oop.myClass;

public class Tester {
    public static void main(String[] args) {
        Clock clock1 = new Clock();
        Clock clock2 = new Clock();
        clock1.hour = 13;
        clock1.minute = 10;
        clock2.hour = 05;
        clock2.minute = 02;

        /*
        clock1.show();
        clock2.show();
        clock1.tick();
        clock1.tick();
        clock1.show();
         */

        clock2.show();
        Clock clock3 = new Clock();
        clock3.hour=5;
        clock3.minute=0;
        clock3.show();

        Clock omer;

    }
}
