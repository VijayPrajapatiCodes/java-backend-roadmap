package Java_8.Predicator.Method;

import java.util.function.Predicate;

public class andMethod {
    public static void main(String[] args) {
        Predicate<Integer>greaterThan10=number->number>10;
        Predicate<Integer>smallerThan100=number->number<100;
        Predicate<Integer>isValidNumber=greaterThan10.and(smallerThan100);
        System.out.println(isValidNumber.test(50));
        System.out.println(isValidNumber.test(5));
        System.out.println(isValidNumber.test(150));
    }
}
