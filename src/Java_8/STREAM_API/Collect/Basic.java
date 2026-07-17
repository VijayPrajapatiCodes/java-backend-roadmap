package Java_8.STREAM_API.Collect;

import java.util.List;
import java.util.stream.Collectors;

public class Basic {
    public static void main(String[] args) {
        List<Integer> numb= List.of(1,2,3,4,5,6);
       List<Integer> evenNumb= numb.stream().filter(num->num%2==0)
                .collect(Collectors.toList());
        System.out.println(evenNumb);

    }
}
