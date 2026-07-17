package Java_8.STREAM_API.Filter;

import java.util.List;

public class StartWith {
    public static void main(String[] args) {
        List<String> names =
                List.of(
                        "Vijay",
                        "Rahul",
                        "Aman",
                        "Vinay",
                        "Vikas"
                );
        names.stream().filter(name->name.startsWith("V"))
                .forEach(System.out::println);
    }
}
