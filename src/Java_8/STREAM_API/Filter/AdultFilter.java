package Java_8.STREAM_API.Filter;

import java.util.List;

public class AdultFilter {
    public static void main(String[] args) {
        List<Integer> ages =
                List.of(12,15,18,20,25,16,30);
        ages.stream().filter(age->age>=18)
                .forEach(System.out::println);
    }
}
