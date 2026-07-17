package Java_8.Predicator.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers =
                List.of(10, 15, 20, 25, 30);

        Predicate<Integer> isEven =
                number -> number % 2 == 0;

        for (Integer number : numbers) {

            if (isEven.test(number)) {
                System.out.println(number);
            }
        }
    }
}