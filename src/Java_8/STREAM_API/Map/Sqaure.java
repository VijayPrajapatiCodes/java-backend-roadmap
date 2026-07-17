package Java_8.STREAM_API.Map;

import java.util.List;

public class Sqaure {
    public static void main(String[] args) {
        List<Integer> numbers =
                List.of(2,3,4,5);
        numbers.stream().map(number->number*number)
                .forEach(System.out::println);

    }
}
