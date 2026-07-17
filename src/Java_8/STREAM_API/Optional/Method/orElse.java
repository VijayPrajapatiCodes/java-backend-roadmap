package Java_8.STREAM_API.Optional.Method;

import java.util.Optional;

public class orElse {
    public static void main(String[] args) {
        Optional<String> name =
                Optional.empty();

        String result =
                name.orElse("Guest");

        System.out.println(result);
    }
}
