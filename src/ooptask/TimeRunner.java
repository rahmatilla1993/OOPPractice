package ooptask;

public class TimeRunner {
    public static void main(String[] args) {
        var time = new MyTime(23, 59, 59);
        System.out.println(time.nextSeconds());
        System.out.println(time.nextMinute());
    }
}
