package Java_8.Method_Reference;

import java.util.function.Function;

public class StaticMethodReference {
    public static int calculateSquare(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        Function<Integer, Integer> square =
                StaticMethodReference::calculateSquare;

        System.out.println(square.apply(5));
        System.out.println(square.apply(10));
    }
}
