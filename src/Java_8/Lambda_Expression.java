package Java_8;// ============================================================
// JAVA 8 - LAMBDA EXPRESSION COMPLETE PRACTICE PROGRAM
// ============================================================


// ------------------------------------------------------------
// 1. NO PARAMETER + NO RETURN
// ------------------------------------------------------------

@FunctionalInterface
interface Greeting {

    void sayHello();

}


// ------------------------------------------------------------
// 2. ONE PARAMETER + NO RETURN
// ------------------------------------------------------------

@FunctionalInterface
interface Welcome {

    void welcome(String name);

}


// ------------------------------------------------------------
// 3. TWO PARAMETERS + RETURN VALUE
// ------------------------------------------------------------

@FunctionalInterface
interface Calculator {

    int calculate(int a, int b);

}


// ------------------------------------------------------------
// 4. ONE PARAMETER + RETURN VALUE
// ------------------------------------------------------------

@FunctionalInterface
interface Square {

    int findSquare(int number);

}


// ------------------------------------------------------------
// 5. MULTIPLE STATEMENTS IN LAMBDA
// ------------------------------------------------------------

@FunctionalInterface
interface StudentResult {

    void showResult(String name, double marks);

}


// ============================================================
// MAIN CLASS
// ============================================================

public class Lambda_Expression {

    public static void main(String[] args) {


        System.out.println("====================================");
        System.out.println(" JAVA 8 - LAMBDA EXPRESSION");
        System.out.println("====================================");


        // ====================================================
        // 1. NO PARAMETER + NO RETURN
        // ====================================================

        System.out.println("\n1. NO PARAMETER LAMBDA");


        // OLD WAY - ANONYMOUS INNER CLASS
        /*
        Greeting oldGreeting = new Greeting() {

            @Override
            public void sayHello() {

                System.out.println("Hello from Old Way");

            }

        };

        oldGreeting.sayHello();
        */


        // NEW WAY - LAMBDA EXPRESSION

        Greeting greeting =
                () -> System.out.println(
                        "Hello Vijay, Welcome to Java 8"
                );


        // Calling abstract method
        greeting.sayHello();



        // ====================================================
        // 2. ONE PARAMETER + NO RETURN
        // ====================================================

        System.out.println("\n2. ONE PARAMETER LAMBDA");


        Welcome welcome = name ->
                System.out.println(
                        "Welcome " + name
                );


        welcome.welcome("Vijay Prajapati");



        // ====================================================
        // 3. TWO PARAMETERS + RETURN VALUE
        // ====================================================

        System.out.println("\n3. CALCULATOR USING LAMBDA");


        // Addition behavior
        Calculator addition =
                (a, b) -> a + b;


        // Subtraction behavior
        Calculator subtraction =
                (a, b) -> a - b;


        // Multiplication behavior
        Calculator multiplication =
                (a, b) -> a * b;


        // Division behavior
        Calculator division =
                (a, b) -> a / b;


        // Calling same interface method
        // with different Lambda implementations

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


        System.out.println(
                "Division = "
                        + division.calculate(20, 10)
        );



        // ====================================================
        // 4. ONE PARAMETER + RETURN VALUE
        // ====================================================

        System.out.println("\n4. SQUARE USING LAMBDA");


        Square square =
                number -> number * number;


        int result =
                square.findSquare(10);


        System.out.println(
                "Square = " + result
        );



        // ====================================================
        // 5. MULTIPLE STATEMENTS IN LAMBDA
        // ====================================================

        System.out.println("\n5. MULTIPLE STATEMENTS LAMBDA");


        StudentResult studentResult =
                (name, marks) -> {

                    System.out.println(
                            "Student Name : " + name
                    );

                    System.out.println(
                            "Marks : " + marks
                    );


                    if (marks >= 40) {

                        System.out.println(
                                "Result : PASS"
                        );

                    } else {

                        System.out.println(
                                "Result : FAIL"
                        );

                    }

                };


        studentResult.showResult(
                "Vijay Prajapati",
                89.5
        );



        // ====================================================
        // 6. LAMBDA AS METHOD ARGUMENT
        // ====================================================

        System.out.println("\n6. LAMBDA AS METHOD ARGUMENT");


        int answer1 = performCalculation(
                100,
                50,
                (a, b) -> a + b
        );


        int answer2 = performCalculation(
                100,
                50,
                (a, b) -> a * b
        );


        System.out.println(
                "Method Addition = " + answer1
        );


        System.out.println(
                "Method Multiplication = " + answer2
        );



        // ====================================================
        // 7. RUNNABLE WITH LAMBDA
        // ====================================================

        System.out.println("\n7. RUNNABLE WITH LAMBDA");


        // OLD WAY
        /*
        Runnable oldTask = new Runnable() {

            @Override
            public void run() {

                System.out.println(
                        "Thread Running"
                );

            }

        };
        */


        // NEW WAY - LAMBDA

        Runnable task = () -> {

            System.out.println(
                    "Thread is running using Lambda"
            );

            System.out.println(
                    "Thread Name : "
                            + Thread.currentThread().getName()
            );

        };


        Thread thread =
                new Thread(task);


        thread.start();



        // ====================================================
        // 8. DIRECT LAMBDA WITH THREAD
        // ====================================================

        System.out.println("\n8. DIRECT LAMBDA WITH THREAD");


        Thread thread2 =
                new Thread(() -> {

                    System.out.println(
                            "Direct Lambda Thread Running"
                    );

                });


        thread2.start();



        System.out.println("\n====================================");
        System.out.println(" MAIN THREAD COMPLETED");
        System.out.println("====================================");

    }



    // ========================================================
    // METHOD ACCEPTING BEHAVIOR AS PARAMETER
    // ========================================================

    public static int performCalculation(
            int a,
            int b,
            Calculator calculator
    ) {

        return calculator.calculate(a, b);

    }

}