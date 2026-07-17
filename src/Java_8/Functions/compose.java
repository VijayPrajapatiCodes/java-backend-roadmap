package Java_8.Functions;

import java.util.function.Function;

public class compose {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyBy2 =
                number -> number * 2;

        Function<Integer, Integer> add10 =
                number -> number + 10;

        // compose() me add10 PEHLE chalega
        // multiplyBy2 BAAD me chalega
        Function<Integer, Integer> result =
                multiplyBy2.compose(add10);

        System.out.println(result.apply(5));
    }
}