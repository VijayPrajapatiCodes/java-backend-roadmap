package Java_8.STREAM_API.Date_Time_API;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime today=LocalTime.now();
        System.out.println(today);

        System.out.println(today.getHour());

        System.out.println(today.getMinute());

        System.out.println(today.getSecond());


        System.out.println(today.plusHours(2));

        System.out.println(today.minusMinutes(30));
    }
}
