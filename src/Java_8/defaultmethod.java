package Java_8;

@FunctionalInterface
public interface defaultmethod {

    // ONE ABSTRACT METHOD
    int calculate(int a, int b);


    // LAMBDA EXPRESSION
    defaultmethod addition =
            (a, b) -> a + b;


    // DEFAULT METHOD
    default void showMessage() {

        System.out.println("Calculator Running");

    }


    // MAIN METHOD
    public static void main(String[] args) {

        // Lambda wale abstract method ko call kiya
        int result = addition.calculate(10, 50);

        System.out.println("Addition = " + result);


        // Default method ko call kiya
        addition.showMessage();

    }
}