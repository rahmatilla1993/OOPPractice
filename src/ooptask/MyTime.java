package ooptask;

public class MyTime {
    private int hour;
    private int minute;
    private int second;
    private boolean validHour;
    private boolean validMinute;
    private boolean validSeconds;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public String nextHour() {
        if (validHour && validMinute && validSeconds) {
            hour++;
            if (hour == 24)
                hour = 0;
            return toString();
        } else return "Invalid time";
    }

    public String nextMinute() {
        if (validHour && validMinute && validSeconds) {
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24)
                    hour = 0;
            }
            return toString();
        } else return "Invalid time";
    }

    public String nextSeconds() {
        if (validHour && validMinute && validSeconds) {
            second++;
            if (second == 60) {
                second = 0;
                minute++;
                if (minute == 60) {
                    minute = 0;
                    hour++;
                    if (hour == 24)
                        hour = 0;
                }
            }
            return toString();
        } else return "Invalid time";
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
            this.validHour = true;
        } else
            System.out.println("Invalid hour value");
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
            this.validMinute = true;
        } else
            System.out.println("Invalid minute value");
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
            this.validSeconds = true;
        } else
            System.out.println("Invalid second value");
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
