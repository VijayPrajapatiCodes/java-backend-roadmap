package Java_8.STREAM_API;

import java.util.List;

public class SkipExample {

    public static void main(String[] args) {

        List<Integer> numbers =
                List.of(10,20,30,40,50,60);

        numbers.stream()
                .skip(3)
                .forEach(System.out::println);

    }
}