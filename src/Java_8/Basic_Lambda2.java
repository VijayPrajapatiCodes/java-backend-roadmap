package Java_8;

public class Basic_Lambda2 {


    // =========================================================
    // PART 1: NORMAL METHODS
    // =========================================================


    // 1. Addition
    public static int normalAddition(int a, int b) {

        return a + b;

    }


    // 2. Subtraction
    public static int normalSubtraction(int a, int b) {

        return a - b;

    }


    // 3. Multiplication
    public static int normalMultiplication(int a, int b) {

        return a * b;

    }


    // 4. Division
    public static int normalDivision(int a, int b) {

        return a / b;

    }


    // 5. Modulus
    public static int normalModulus(int a, int b) {

        return a % b;

    }


    // 6. Maximum
    public static int normalMaximum(int a, int b) {

        if (a > b) {

            return a;

        } else {

            return b;

        }

    }


    // 7. Minimum
    public static int normalMinimum(int a, int b) {

        if (a < b) {

            return a;

        } else {

            return b;

        }

    }



    // =========================================================
    // PART 2: FUNCTIONAL INTERFACE FOR LAMBDA
    // =========================================================

    @FunctionalInterface
    interface Calculator {

        int calculate(int a, int b);

    }



    // =========================================================
    // PART 3: SAME OPERATIONS USING LAMBDA EXPRESSIONS
    // =========================================================


    // 1. Addition
    static Calculator lambdaAddition =
            (a, b) -> a + b;


    // 2. Subtraction
    static Calculator lambdaSubtraction =
            (a, b) -> a - b;


    // 3. Multiplication
    static Calculator lambdaMultiplication =
            (a, b) -> a * b;


    // 4. Division
    static Calculator lambdaDivision =
            (a, b) -> a / b;


    // 5. Modulus
    static Calculator lambdaModulus =
            (a, b) -> a % b;


    // 6. Maximum
    static Calculator lambdaMaximum = (a, b) -> {

        if (a > b) {

            return a;

        } else {

            return b;

        }

    };


    // 7. Minimum
    static Calculator lambdaMinimum = (a, b) -> {

        if (a < b) {

            return a;

        } else {

            return b;

        }

    };



    // =========================================================
    // MAIN METHOD
    // =========================================================

    public static void main(String[] args) {


        int a = 20;
        int b = 10;


        // =====================================================
        // NORMAL METHODS OUTPUT
        // =====================================================

        System.out.println("=================================");
        System.out.println("       NORMAL METHODS");
        System.out.println("=================================");


        System.out.println(
                "Addition = "
                        + normalAddition(a, b)
        );


        System.out.println(
                "Subtraction = "
                        + normalSubtraction(a, b)
        );


        System.out.println(
                "Multiplication = "
                        + normalMultiplication(a, b)
        );


        System.out.println(
                "Division = "
                        + normalDivision(a, b)
        );


        System.out.println(
                "Modulus = "
                        + normalModulus(a, b)
        );


        System.out.println(
                "Maximum = "
                        + normalMaximum(a, b)
        );


        System.out.println(
                "Minimum = "
                        + normalMinimum(a, b)
        );



        // =====================================================
        // LAMBDA EXPRESSIONS OUTPUT
        // =====================================================

        System.out.println();

        System.out.println("=================================");
        System.out.println("       LAMBDA EXPRESSIONS");
        System.out.println("=================================");


        System.out.println(
                "Addition = "
                        + lambdaAddition.calculate(a, b)
        );


        System.out.println(
                "Subtraction = "
                        + lambdaSubtraction.calculate(a, b)
        );


        System.out.println(
                "Multiplication = "
                        + lambdaMultiplication.calculate(a, b)
        );


        System.out.println(
                "Division = "
                        + lambdaDivision.calculate(a, b)
        );


        System.out.println(
                "Modulus = "
                        + lambdaModulus.calculate(a, b)
        );


        System.out.println(
                "Maximum = "
                        + lambdaMaximum.calculate(a, b)
        );


        System.out.println(
                "Minimum = "
                        + lambdaMinimum.calculate(a, b)
        );

    }

}