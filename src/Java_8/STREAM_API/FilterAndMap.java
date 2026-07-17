package Java_8.STREAM_API;

import java.util.List;

public class FilterAndMap {
    public static void main(String[] args) {

        List<Integer> numbers =
                List.of(1,2,3,4,5,6);

        numbers.stream()

                .filter(num -> num % 2 == 0)

                .map(num -> num * 100)

                .forEach(System.out::println);

    }
}
