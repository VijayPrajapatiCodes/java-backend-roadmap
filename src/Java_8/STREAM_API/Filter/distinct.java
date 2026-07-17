package Java_8.STREAM_API.Filter;

import java.util.List;

public class distinct {

    public static void main(String[] args) {

        List<Integer> numbers =
                List.of(1,2,2,3,4,4,5,5,6);

        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }
}