package Java_8.Predicator;

import java.awt.*;
import java.util.function.Predicate;

public class Basic {
    public static void main(String[] args) {


    Predicate<Integer> isadult= age->age>=18;
        System.out.println(isadult.test(15));
        System.out.println(isadult.test(56));
    }
}
