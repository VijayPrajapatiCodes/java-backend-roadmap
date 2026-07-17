package Java_8.STREAM_API.Sortings;

import java.util.List;

public class Sortings {

    public static void main(String[] args) {

        List<Integer> numbers =
                List.of(50,10,40,20,30);

        numbers.stream()
                .sorted()
                .forEach(System.out::println);
    }
}