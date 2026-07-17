package Java_8.Functions;

import java.util.function.Function;

public class FunctionComparison {

    public static void main(String[] args) {

        Function<Integer, Integer> multiplyBy2 =
                number -> number * 2;

        Function<Integer, Integer> add10 =
                number -> number + 10;

        Function<Integer, Integer> andThenResult =
                multiplyBy2.andThen(add10);

        Function<Integer, Integer> composeResult =
                multiplyBy2.compose(add10);

        System.out.println(
                "andThen Result: " + andThenResult.apply(5)
        );

        System.out.println(
                "compose Result: " + composeResult.apply(5)
        );
    }
}

