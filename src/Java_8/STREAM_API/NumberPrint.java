package Java_8.STREAM_API;

import java.util.List;

public class NumberPrint {
    public static void main(String[] args) {

        List<Integer> number=List.of(10,50,21,41,32,41);
        number.stream().forEach(System.out::println);
    }
}
