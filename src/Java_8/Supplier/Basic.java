package Java_8.Supplier;

import java.util.function.Supplier;

public class Basic {

    public static void main(String[] args) {

        // First Supplier
        Supplier<String> message =
                () -> "Hello Vijay";

        System.out.println(message.get());


        // Second Supplier
        Supplier<String> studentInfo = () -> {

            String name = "Vijay";
            String course = "B.Tech CSE";

            return name + " - " + course;
        };

        // Lambda ke bahar get() call hoga
        System.out.println(studentInfo.get());
    }
}