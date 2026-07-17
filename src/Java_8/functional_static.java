package Java_8;


public class functional_static{


    // ==========================================
    // FUNCTIONAL INTERFACE
    // ==========================================

    @FunctionalInterface
    interface Calculator {


        // ======================================
        // ONLY ONE ABSTRACT METHOD
        // ======================================

        int calculate(int a, int b);



        // ======================================
        // DEFAULT METHOD
        // ======================================

        default void showMessage() {

            System.out.println(
                    "Calculator is Running"
            );

        }



        // ======================================
        // STATIC METHOD
        // ======================================

        static void info() {

            System.out.println(
                    "This is Calculator Functional Interface"
            );

        }

    }



    // ==========================================
    // LAMBDA EXPRESSIONS
    // ==========================================

    static Calculator addition =
            (a, b) -> a + b;


    static Calculator subtraction =
            (a, b) -> a - b;


    static Calculator multiplication =
            (a, b) -> a * b;



    // ==========================================
    // MAIN METHOD
    // ==========================================

    public static void main(String[] args) {


        // Abstract Method Implementation
        // Lambda ke through

        System.out.println(
                "Addition = "
                        + addition.calculate(20, 10)
        );


        System.out.println(
                "Subtraction = "
                        + subtraction.calculate(20, 10)
        );


        System.out.println(
                "Multiplication = "
                        + multiplication.calculate(20, 10)
        );



        // Default Method
        addition.showMessage();



        // Static Method
        Calculator.info();

    }

}