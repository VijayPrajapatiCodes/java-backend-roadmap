package Java_8.STREAM_API.Map;

import java.util.List;

public class UpperCase {
    public static void main(String[] args) {


    List<String> names =
            List.of(
                    "vijay",
                    "rahul",
                    "aman"
            );

        names.stream()

                .map(String::toUpperCase)

                .forEach(System.out::println);
    }
}


