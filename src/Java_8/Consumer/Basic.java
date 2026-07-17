package Java_8.Consumer;

import java.util.function.Consumer;

public class Basic {
    public static void main(String[] args) {
        Consumer<String> printName=name-> System.out.println(name);
        printName.accept("Vijay");
    }
}
