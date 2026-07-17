package Java_8.Predicator.Method;

import java.util.function.Predicate;

public class testMethod {
    public static void main(String[] args) {
        Predicate<Integer> isEven =
                number -> number % 2 == 0;

        System.out.println(isEven.test(10));
        System.out.println(isEven.test(7));
    }
}
