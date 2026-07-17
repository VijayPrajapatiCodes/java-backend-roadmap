package Java_8.STREAM_API.Date_Time_API;
import java.time.Period;
import java.time.LocalDate;

public class Periods {
    public static void main(String[] args) {
        LocalDate birthDate=LocalDate.of(2004,  1,20);
        LocalDate today=LocalDate.now();
        Period age=Period.between(birthDate,today);
        System.out.println(age);
        System.out.println(
                age.getYears()
        );

        System.out.println(
                age.getMonths()
        );

        System.out.println(
                age.getDays()
        );
    }
}
