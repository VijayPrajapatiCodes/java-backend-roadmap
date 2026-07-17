package Java_8.STREAM_API.Date_Time_API;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Durations {
    public static void main(String[] args) {
        LocalTime start= LocalTime.of(6,15);
        LocalTime end  = LocalTime.now();
        Duration durations=Duration.between(start,end);
        System.out.println(durations);

    }
}
