package Statements;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

    }

    public int getMinutes() {
        return hours*60+minutes;

    }

    public int getSeconds() {
        return hours*3600+minutes*60+seconds;

    }

    public boolean earlyerThan(Time time) {
        thia.hours*3600+this.minutes*60+this.seconds < getSeconds();

    }

}

