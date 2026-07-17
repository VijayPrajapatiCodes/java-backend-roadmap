package Multithreading;

public class join {

    public static void main(String[] args)
            throws InterruptedException {

        Thread t1 = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {
                System.out.println("Task: " + i);
            }

        });

        t1.start();

        t1.join();

        System.out.println("Task Completed");
    }
}