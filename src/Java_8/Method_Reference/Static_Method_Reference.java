package Java_8.Method_Reference;

import java.util.function.Function;

public class Static_Method_Reference {

    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        Function<Integer, Integer> squareFunction =
                Static_Method_Reference::square;

        System.out.println(squareFunction.apply(5));
    }
}
