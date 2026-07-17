package Java_8.STREAM_API.Map;

import java.util.List;

public class Lengths {
    public static void main(String[] args) {
        List<String> names= List.of("Vijay","Rahul","Aman");
        names.stream().map(String::length)
                .forEach(System.out::println);
    }
}
