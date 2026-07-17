package Java_8.Functions;

import java.util.function.Function;

public class FunctionandThen {
    public static void main(String[] args) {

            // First Function: number ko 2 se multiply karega
            Function<Integer, Integer> multiplyBy2 =
                    number -> number * 2;

            // Second Function: result me 10 add karega
            Function<Integer, Integer> add10 =
                    number -> number + 10;

            // Pehle multiplyBy2, uske BAAD add10
            Function<Integer, Integer> result =
                    multiplyBy2.andThen(add10);

            System.out.println(result.apply(5));
    }
}
