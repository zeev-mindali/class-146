package oop.myClass.targil1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Clock c1 = new Clock();
        c1.show();
        /*
            System.out.println("Please enter hour second minutes");
            int hour = input.nextInt();
            int minutes = input.nextInt();
            int seconds = input.nextInt();
            Clock c2 = new Clock(hour,minutes,seconds);
        */
        Clock c3 = new Clock(25, 60, 0,0);
        //c3.setMinutes(32);
        c3.show();


        /*
        c1.show();
        c1.setHour(9);
        c1.setMinutes(59);
        c1.setSeconds(58);
        c1.show();
        c1.repeatTick(20_000);  //1,570,230 -> 1_570_230
        c1.show();
        c1.reset();
        c1.show();\

         */
    }
}
