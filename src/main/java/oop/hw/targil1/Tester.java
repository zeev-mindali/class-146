package oop.hw.targil1;

public class Tester {
    public static void main(String[] args) {
        Clock c1 = new Clock();
        c1.show();
        c1.setHour(9);
        c1.setMinutes(59);
        c1.setSeconds(58);
        c1.show();
        c1.repeatTick(20_000);  //1,570,230 -> 1_570_230
        c1.show();
        c1.reset();
        c1.show();
    }
}
