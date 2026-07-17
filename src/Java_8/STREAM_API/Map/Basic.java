package Java_8.STREAM_API.Map;

import java.util.List;

public class Basic {
    public static void main(String[] args) {
        List<Integer> number=List.of(1,2,3,4,5);
        number.stream().map(numbers->numbers*10)
                .forEach(System.out::println);
    }
}
