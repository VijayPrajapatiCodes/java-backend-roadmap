package Java_8.Consumer;

import java.util.function.Consumer;

public class Square {
    public static void main(String[] args) {
        Consumer<Integer> printSquare=number-> System.out.println(number*number);
        printSquare.accept(6);
    }
}
