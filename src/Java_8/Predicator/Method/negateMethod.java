package Java_8.Predicator.Method;

import java.util.function.Predicate;

public class negateMethod {
    public static void main(String[] args) {
        Predicate<Integer>isAdult=age->age>=18;
        Predicate<Integer> isMinor=isAdult.negate();
        System.out.println(isMinor.test(15));
        System.out.println(isMinor.test(85));
    }
}
