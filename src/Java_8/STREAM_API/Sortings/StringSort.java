package Java_8.STREAM_API.Sortings;
import java.util.List;

public class StringSort {

    public static void main(String[] args) {

        List<String> names =
                List.of(
                        "Vijay",
                        "Rahul",
                        "Aman",
                        "Rohit"
                );

        names.stream()
                .sorted()
                .forEach(System.out::println);

    }
}