package Java_8.STREAM_API.Optional.Method;

import java.util.Optional;

public class isPresent {
    public static void main(String[] args) {
            Optional<String> name =
                    Optional.of("Vijay");

            name.ifPresent(System.out::println);

        }
    }

