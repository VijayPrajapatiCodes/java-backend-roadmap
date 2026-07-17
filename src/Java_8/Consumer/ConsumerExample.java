package Java_8.Consumer;


import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        // Consumer<String> String input lega
        // aur us par action perform karega
        // kuch return nahi karega
        Consumer<String> studentInfo = name -> {

            System.out.println("Student Name: " + name);
            System.out.println("Uppercase Name: " + name.toUpperCase());
            System.out.println("Name Length: " + name.length());

        };

        // Consumer ko execute karne ke liye accept() method
        studentInfo.accept("Vijay");
    }
}