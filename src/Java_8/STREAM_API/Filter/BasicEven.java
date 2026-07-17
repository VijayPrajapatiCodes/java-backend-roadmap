package Java_8.STREAM_API.Filter;

import java.util.List;

public class BasicEven {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,23,40,56,21,20,74);
        numbers.stream().filter(number->number%2==0)
                .forEach(System.out::println);
    }
}
