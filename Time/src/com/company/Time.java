package com.company;
public class Time {
    private int second;
    private int minute;
    private int hour;

    public Time(int ss,int mm,int hh)
    {
        second=ss;
        minute=mm;
        hour=hh;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String toString()
    {
        return "Time:" +Integer.toString(this.hour)+ ":" + Integer.toString(this.minute) +":" + Integer.toString(this.second);

    }



}
