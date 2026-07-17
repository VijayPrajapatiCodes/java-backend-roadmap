package Java_8.STREAM_API.Optional;

import java.util.Optional;

public class isPresent {
    public static void main(String[] args) {
        Optional<String>name=Optional.of("Vijay");
        System.out.println(name.isPresent());
    }
}
