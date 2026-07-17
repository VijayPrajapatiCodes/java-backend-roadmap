package Java_8.STREAM_API.Date_Time_API;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatters {
    public static void main(String[] args) {
        LocalDate today =
                LocalDate.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern(
                        "dd/MM/yyyy"
                );

        String result =
                today.format(formatter);

        System.out.println(result);

    }
    }

