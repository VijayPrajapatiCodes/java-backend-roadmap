package Java_8.STREAM_API.Filter;

import java.util.List;

public class String_Lenght {
    public static void main(String[] args) {
        List<String> names = List.of(
                        "Vijay",
                        "Ram",
                        "Rahul",
                        "Aman",
                        "Krishna"
                );
        names.stream().filter(name->name.length()>4)
                .forEach(System.out::println);
    }
}
