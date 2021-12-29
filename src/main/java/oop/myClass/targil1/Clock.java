package oop.myClass.targil1;

public class Clock {
    //variables + finals
    private int seconds, minutes, hour, miliSeconds;


    //c'tor -> constructor
    public Clock(){
        this(0,0,0,0);
        System.out.println("I created a clock 00:00");
    }

    public Clock (int hour){
        /*
        setHour(hour);
        setMinutes(0);
        setSeconds(0);
        */
        this(hour,0,0,0);
    }
    public Clock(int hour, int minutes){
        /*
        setHour(hour);
        setMinutes(minutes);
        setSeconds(0);
        */
        this(hour,minutes,0,0);
    }

    public Clock(int hour, int minutes, int seconds, int miliSeconds) {
        System.out.println("Creating a new instance of Clock");
        setHour(hour);
        setMinutes(minutes);
        setSeconds(seconds);
        setMiliSeconds(miliSeconds);
    }

    public Clock(Clock other){
        this.hour=other.hour;
        this.minutes=other.minutes;
        this.seconds=other.seconds;
    }

    //set & get
    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
        if (seconds < 0 || seconds > 59) {
            System.out.println("seconds must be between 0-59");
            seconds = 0;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
        if (minutes < 0 || minutes > 59) {
            System.out.println("minutes must be between 0-59");
            this.minutes = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        if (hour < 0 || hour > 23) {
            System.out.println("Hour must be between 0-23");
            this.hour = 0;
        }
    }

    public int getMiliSeconds() {
        return miliSeconds;
    }

    public void setMiliSeconds(int miliSeconds) {
        this.miliSeconds = miliSeconds;
    }

    //method
    public void show() {
        System.out.println(
                (this.hour < 10 ? "0" + this.hour : this.hour) + ":" +
                        (this.minutes < 10 ? "0" + this.minutes : this.minutes) + ":" +
                        (this.seconds < 10 ? "0" + this.seconds : this.seconds)
        );
    }

    public void tick() {
        //advance by one the second
        this.seconds++;
        //calculate the time to show a normal clock, not 24 hour or 60 minutes/second
        calcTime();
    }

    public void repeatTick(int repeat) { //2
        for (int counter = repeat; counter > 0; counter--) {
            tick();
        }
    }

    public void reset() {
        this.seconds = 0;
        this.minutes = 0;
        this.hour = 0;
    }

    private void calcTime() {
        this.minutes += this.seconds / 60;
        this.seconds %= 60;
        this.hour += this.minutes / 60;
        this.minutes %= 60;
        this.hour %= 24;
    }


}
