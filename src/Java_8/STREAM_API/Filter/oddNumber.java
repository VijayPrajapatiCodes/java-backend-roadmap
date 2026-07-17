package Java_8.STREAM_API.Filter;

import java.util.List;

public class oddNumber {
    public static void main(String[] args) {
        List<Integer> oddNum= List.of(1,2,3,4,5,6,7,8,9,12,11,13);
        oddNum.stream().filter(num->num%2!=0)
                .forEach(System.out::println);
    }
}
