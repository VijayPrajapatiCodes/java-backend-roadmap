package Java_8.Method_Reference;

import java.util.function.Consumer;

public class Basic {
    public static void main(String[] args) {
        Consumer<String> print=
                System.out::println;
        print.accept("Vijay");
    }
}
