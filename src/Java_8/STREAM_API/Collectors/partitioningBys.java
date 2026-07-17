package Java_8.STREAM_API.Collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class partitioningBys {
    public static void main(String[] args) {
         List<Integer> students=List.of(12,5,18,10,23,25);
        Map<Boolean,List<Integer>>result=students.stream().collect(Collectors.partitioningBy(n->n>15));
        System.out.println(result);
    }
}
