package classObjectInJava;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime starTime, endTime;
    public StopWatch(){
        starTime = LocalTime.now();
    }

    public StopWatch(LocalTime starTime, LocalTime endTime) {
        this.starTime = starTime;
        this.endTime = endTime;
    }

    public LocalTime getStarTime() {
        return starTime;
    }

    public void setStarTime(LocalTime starTime) {
        this.starTime = starTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
    public void star(){
        starTime = LocalTime.now();
    }
    public void stop(){
        endTime = LocalTime.now();
    }
    public int getElapsedTime(){
        int miliSecond = ((endTime.getHour()-starTime.getHour())*3600
                + (endTime.getMinute()-starTime.getMinute())*60
                + (endTime.getSecond()-starTime.getSecond())*1000);
        return miliSecond;
    }
}
