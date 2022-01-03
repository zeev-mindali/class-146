package my_static;

public class Clock {
    public final int HOUR=24;
    public final int MINUTE=60;

    private static int format=24;

    private int hour;
    private int minute;

    public Clock(int hour, int minute) {
//        this.hour = hour;
//        this.minute = minute;
        setHour(hour);
        setMinute(minute);
    }

    public Clock(Clock other){
        this.hour=other.hour;
        this.minute=other.minute;
    }

    public static int getFormat() {
        return format;
    }

    public static void setFormat(boolean is24) {
        format = is24?24:12;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour%this.HOUR;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute%this.MINUTE;
    }

    @Override
    public String toString() {
        String ampm="";
        int myHour = this.hour%format;
        if (format==12){
            ampm=hour<12?"AM":"PM";
        } else {
            ampm="";
        }
        return (myHour<10?"0"+myHour:myHour)+":"+(minute<10?"0"+minute:minute)+" "+ampm;
    }
}
