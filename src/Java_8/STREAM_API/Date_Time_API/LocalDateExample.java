package Java_8.STREAM_API.Date_Time_API;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println(today);
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfMonth());


        System.out.println(today.plusDays(10));

        System.out.println(today.minusMonths(2));

        System.out.println(today.plusYears(1));
    }
}
