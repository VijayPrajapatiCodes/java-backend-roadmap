package Java_8.STREAM_API.Optional;

import java.util.Optional;

public class Optional_map {
    public static void main(String[] args) {
        Optional<String> name= Optional.of("Vijay");
        name.map(String::toUpperCase)
                .ifPresent(System.out::println);
    }
}
