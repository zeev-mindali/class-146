package oop.myClass.targil1;

public class Tester2 {
    public static void main(String[] args) {
        Clock c1 = new Clock(14,15,00,00);
        Clock c2 = new Clock(c1);
        c2.setMinutes(20);

        c1.show();
        c2.show();
    }
}
