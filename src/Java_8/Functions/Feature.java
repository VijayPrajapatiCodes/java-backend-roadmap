package Java_8.Functions;

import java.util.function.Function;

public class Feature {
    public static void main(String[] args) {
        Function<Integer, String> checkAge=
                age ->age >= 18 ? "Adult":"Mirror";
        System.out.println(checkAge.apply(22));
        System.out.println(checkAge.apply(15));

    }
}
