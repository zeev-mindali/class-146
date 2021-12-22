package oop.hw.targil1;

public class Clock {
    //variables + finals
    private int seconds, minutes, hour;

    //c'tor -> constructor

    //set & get

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
        if (seconds<0 || seconds>59){
            System.out.println("seconds must be between 0-59");
            seconds=0;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
        if (minutes<0 || minutes>59){
            System.out.println("minutes must be between 0-59");
            this.minutes=0;
        }

    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        if (hour<0 || hour>23){
            System.out.println("Hour must be between 0-23");
            this.hour=0;
        }
    }

    //method
    public void show() {
        System.out.println(
                (this.hour < 10 ? "0" + this.hour : this.hour) + ":" +
                        (this.minutes < 10 ? "0" + this.minutes : this.minutes) + ":" +
                        (this.seconds < 10 ? "0" + this.seconds : this.seconds)
        );
    }

    public void tick(){
        //advance by one the second
        this.seconds++;
        //calculate the time to show a normal clock, not 24 hour or 60 minutes/second
        calcTime();
    }

    public void repeatTick(int repeat){ //2
        for (int counter = repeat; counter > 0; counter--) {
            tick();
        }
    }

    public void reset(){
        this.seconds=0;
        this.minutes=0;
        this.hour=0;
    }

    private void calcTime(){
        this.minutes += this.seconds/60;
        this.seconds%=60;
        this.hour+=this.minutes/60;
        this.minutes%=60;
        this.hour%=24;
    }


}
