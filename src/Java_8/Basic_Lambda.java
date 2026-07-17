package Java_8;

public class Basic_Lambda {

    // Ek hi Functional Interface
    @FunctionalInterface
    interface Calculator {

        int calculate(int a, int b);

    }

    public static void main(String[] args) {

        // Addition
        Calculator addition = (a, b) -> a + b;

        // Subtraction
        Calculator subtraction = (a, b) -> a - b;

        // Multiplication
        Calculator multiplication = (a, b) -> a * b;

        // Division
        Calculator division = (a, b) -> a / b;

        // Modulus
        Calculator modulus = (a, b) -> a % b;

        // Maximum Number
        Calculator maximum = (a, b) -> {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        };

        // Minimum Number
        Calculator minimum = (a, b) -> {
            if (a < b) {
                return a;
            } else {
                return b;
            }
        };


        // =========================
        // CALLING LAMBDA EXPRESSIONS
        // =========================

        System.out.println(
                "Addition = " + addition.calculate(20, 10)
        );

        System.out.println(
                "Subtraction = " + subtraction.calculate(20, 10)
        );

        System.out.println(
                "Multiplication = " + multiplication.calculate(20, 10)
        );

        System.out.println(
                "Division = " + division.calculate(20, 10)
        );

        System.out.println(
                "Modulus = " + modulus.calculate(20, 10)
        );

        System.out.println(
                "Maximum = " + maximum.calculate(20, 10)
        );

        System.out.println(
                "Minimum = " + minimum.calculate(20, 10)
        );
    }
}