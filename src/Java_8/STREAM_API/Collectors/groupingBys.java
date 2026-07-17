package Java_8.STREAM_API.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupingBys {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Amit",
                "Ankit",
                "Rahul",
                "Riya",
                "Rohit",
                "Neha"
        );
        Map<Integer,List<String>> result=names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(result);
    }
}
