package Java_8.STREAM_API.reduce;


import java.util.List;

public class Basic {

    public static void main(String[] args) {

        List<Integer> numbers =
                List.of(10,20,30,40);

        Integer sum =
                numbers.stream()
                        .reduce(0, (a,b) -> a + b);

        System.out.println(sum);

    }
}
