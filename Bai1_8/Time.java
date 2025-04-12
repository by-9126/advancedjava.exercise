package Bai1_8;

public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute,int second){
        this.hour =hour;
        this.minute =minute;
        this.second =second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public Time nextSecond(){
        setSecond(getSecond()+1);
        return this;
    }
    public Time previousSecond(){
        setSecond(getSecond()-1);
        return this;
    }
    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;

    }
}
