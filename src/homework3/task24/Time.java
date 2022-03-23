package homework3.task24;

public class Time {
    private int second;
    private int minute;
    private int hour;
    int totalSec = second + (minute * 60) + (hour * 3600);

    public Time(int second) {
        this.second = second;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getTotalSecond() {
        totalSec = second + (minute * 60) + (hour * 3600);
        return totalSec;
    }

    public int compareTime(Time time2) {
        return totalSec - time2.getTotalSecond();
    }

    public String outputData() {
        return "Time contains " + hour + " hours " + minute + " minutes " + second + " seconds. "
                + "Total seconds: " + totalSec;
    }


}
