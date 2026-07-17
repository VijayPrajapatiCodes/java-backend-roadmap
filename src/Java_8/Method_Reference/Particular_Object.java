package Java_8.Method_Reference;

import java.util.function.Consumer;

public class Particular_Object {

    public void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {

        Particular_Object printer =
                new Particular_Object();

        Consumer<String> print =
                printer::printMessage;

        print.accept("Hello Vijay");
    }
}
