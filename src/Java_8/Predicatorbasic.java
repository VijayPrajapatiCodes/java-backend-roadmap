package Java_8;

import java.util.function.Predicate;

public class Predicatorbasic {
    public static void main(String[] args) {
        Predicate<Integer> isAdult=age->age>=18;
        System.out.println(isAdult.test(22));
        System.out.println(isAdult.test(15));


    }
}
