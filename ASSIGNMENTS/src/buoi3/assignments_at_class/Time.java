package buoi3.assignments_at_class;

public class Time {
    private int minute;
    private int second;
    private int hour;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time() {
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void nextSecond() {
        if (this.second < 59) {
            this.second++;
        } else {
            if (minute < 59) {
                this.minute++;
                this.second = 0;
            } else {
                if (hour < 23) {
                    this.hour++;
                    this.minute = 0;
                    this.second = 0;
                } else {
                    this.hour = 0;
                    this.minute = 0;
                    this.second = 0;
                }
            }

        }
    }

    public void previousSecond() {
        if (this.second > 0) {
            this.second--;
        } else {
            if (minute > 0) {
                this.minute--;
                this.second = 59;
            } else {
                if (hour > 0) {
                    this.hour--;
                    this.minute = 59;
                    this.second = 59;
                } else {
                    this.hour = 23;
                    this.minute = 59;
                    this.second = 59;
                }
            }
        }
    }

    public String format(String n) {
        int m = Integer.parseInt(n);
        if (m < 10) {
            n = "0" + n;
        }
        return n;
    }

    public void display() {
        String sHour = Integer.toString(hour);
        String sMinute = Integer.toString(minute);
        String sSecond = Integer.toString(second);
        System.out.println(format(sHour) + ":" + format(sMinute) + ":" + format(sSecond));
    }

}
