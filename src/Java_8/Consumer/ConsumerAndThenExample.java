package Java_8.Consumer;


import java.util.function.Consumer;

public class ConsumerAndThenExample {

    public static void main(String[] args) {

        // First Consumer
        Consumer<String> printName = name ->
                System.out.println("Student Name: " + name);

        // Second Consumer
        Consumer<String> printUpperCase = name ->
                System.out.println("Uppercase Name: " + name.toUpperCase());

        // Dono Consumers ko combine kiya
        Consumer<String> studentInfo =
                printName.andThen(printUpperCase);

        // Execute
        studentInfo.accept("Vijay");
    }
}
