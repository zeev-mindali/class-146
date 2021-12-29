package oop.myClass;

public class Clock {
    public int hour=0;
    public int minute=0;

    public void show(){
        System.out.println((hour<10?"0"+hour:hour)+":"
                +(minute<10?"0"+minute:minute));
    }

    public void tick(){
        minute++;
        if (minute==60){
            minute=0;
            hour++;
        }
        if (hour==24){
            hour=0;
        }
    }
}
