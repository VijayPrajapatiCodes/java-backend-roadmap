package Multithreading;

import java.util.concurrent.*;

public class MultithreadingMasterDemo {

    // =========================================================
    // 1. THREAD CLASS
    // =========================================================

    static class MyThread extends Thread {

        @Override
        public void run() {

            System.out.println(
                    "[Thread Class] Running on: "
                            + Thread.currentThread().getName()
            );
        }
    }


    // =========================================================
    // 2. RUNNABLE INTERFACE
    // =========================================================

    static class MyRunnable implements Runnable {

        @Override
        public void run() {

            System.out.println(
                    "[Runnable] Running on: "
                            + Thread.currentThread().getName()
            );
        }
    }


    // =========================================================
    // 3. RACE CONDITION + SYNCHRONIZED
    // =========================================================

    static class Counter {

        private int count = 0;

        // synchronized prevents race condition
        public synchronized void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }


    // =========================================================
    // 4. VOLATILE
    // =========================================================

    static class Worker {

        // Latest value visible to other threads
        private volatile boolean running = true;

        public void stopWorker() {
            running = false;
        }

        public void work() {

            while (running) {
                // Simulating work
            }

            System.out.println(
                    "[Volatile] Worker stopped successfully."
            );
        }
    }


    // =========================================================
    // MAIN METHOD
    // =========================================================

    public static void main(String[] args) throws Exception {

        System.out.println("\n========================================");
        System.out.println(" JAVA MULTITHREADING MASTER DEMO");
        System.out.println("========================================");


        // =====================================================
        // 1. CURRENT MAIN THREAD
        // =====================================================

        System.out.println("\n--- 1. Main Thread ---");

        System.out.println(
                "Current Thread: "
                        + Thread.currentThread().getName()
        );


        // =====================================================
        // 2. THREAD CLASS
        // =====================================================

        System.out.println("\n--- 2. Thread Class ---");

        MyThread myThread = new MyThread();

        myThread.start();

        myThread.join();


        // =====================================================
        // 3. RUNNABLE INTERFACE
        // =====================================================

        System.out.println("\n--- 3. Runnable Interface ---");

        MyRunnable task = new MyRunnable();

        Thread runnableThread = new Thread(
                task,
                "Runnable-Thread"
        );

        runnableThread.start();

        runnableThread.join();


        // =====================================================
        // 4. START() VS RUN()
        // =====================================================

        System.out.println("\n--- 4. start() vs run() ---");


        Thread startRunDemo = new Thread(() -> {

            System.out.println(
                    "Executed by: "
                            + Thread.currentThread().getName()
            );

        });


        System.out.println("Calling run() directly:");

        startRunDemo.run();


        System.out.println("Calling start():");

        Thread newThread = new Thread(() -> {

            System.out.println(
                    "Executed by: "
                            + Thread.currentThread().getName()
            );

        });

        newThread.start();

        newThread.join();


        // =====================================================
        // 5. SLEEP()
        // =====================================================

        System.out.println("\n--- 5. sleep() ---");

        Thread sleepThread = new Thread(() -> {

            try {

                System.out.println("Sleeping for 1 second...");

                Thread.sleep(1000);

                System.out.println("Thread woke up!");

            } catch (InterruptedException e) {

                Thread.currentThread().interrupt();
            }

        });

        sleepThread.start();

        sleepThread.join();


        // =====================================================
        // 6. JOIN()
        // =====================================================

        System.out.println("\n--- 6. join() ---");

        Thread joinThread = new Thread(() -> {

            for (int i = 1; i <= 3; i++) {

                System.out.println(
                        "Join Thread: " + i
                );
            }

        });

        joinThread.start();


        // Main thread waits here
        joinThread.join();


        System.out.println(
                "Main continued after joinThread completed."
        );


        // =====================================================
        // 7. THREAD LIFECYCLE
        // =====================================================

        System.out.println("\n--- 7. Thread Lifecycle ---");

        Thread lifecycleThread = new Thread(() -> {

            try {

                Thread.sleep(500);

            } catch (InterruptedException e) {

                Thread.currentThread().interrupt();
            }

        });


        // NEW
        System.out.println(
                "Before start: "
                        + lifecycleThread.getState()
        );


        lifecycleThread.start();


        // Usually RUNNABLE or TIMED_WAITING
        System.out.println(
                "After start: "
                        + lifecycleThread.getState()
        );


        lifecycleThread.join();


        // TERMINATED
        System.out.println(
                "After completion: "
                        + lifecycleThread.getState()
        );


        // =====================================================
        // 8. RACE CONDITION FIX USING SYNCHRONIZED
        // =====================================================

        System.out.println(
                "\n--- 8. Race Condition + synchronized ---"
        );


        Counter counter = new Counter();


        Thread t1 = new Thread(() -> {

            for (int i = 0; i < 10000; i++) {

                counter.increment();
            }

        });


        Thread t2 = new Thread(() -> {

            for (int i = 0; i < 10000; i++) {

                counter.increment();
            }

        });


        t1.start();
        t2.start();


        t1.join();
        t2.join();


        System.out.println(
                "Expected Count: 20000"
        );


        System.out.println(
                "Actual Count: "
                        + counter.getCount()
        );


        // =====================================================
        // 9. VOLATILE
        // =====================================================

        System.out.println("\n--- 9. volatile ---");


        Worker worker = new Worker();


        Thread workerThread = new Thread(
                worker::work
        );


        workerThread.start();


        Thread.sleep(500);


        worker.stopWorker();


        workerThread.join();


        // =====================================================
        // 10. DEADLOCK BASICS
        // =====================================================

        System.out.println("\n--- 10. Deadlock Basics ---");


        System.out.println("""
                
                Deadlock Situation:

                Thread-1:
                    Lock A acquired
                    Waiting for Lock B

                Thread-2:
                    Lock B acquired
                    Waiting for Lock A

                Result:
                    Both threads wait forever.

                Prevention:
                    Always acquire locks
                    in the same order.
                """);


        /*
        ========================================================
        DANGEROUS DEADLOCK EXAMPLE
        ========================================================

        We are NOT running this because
        the program may hang forever.

        Object lockA = new Object();
        Object lockB = new Object();


        Thread deadlockThread1 = new Thread(() -> {

            synchronized (lockA) {

                synchronized (lockB) {

                    System.out.println("Thread 1");
                }
            }

        });


        Thread deadlockThread2 = new Thread(() -> {

            synchronized (lockB) {

                synchronized (lockA) {

                    System.out.println("Thread 2");
                }
            }

        });


        deadlockThread1.start();

        deadlockThread2.start();

        ========================================================
        */


        // =====================================================
        // 11. EXECUTOR SERVICE + THREAD POOL
        // =====================================================

        System.out.println(
                "\n--- 11. ExecutorService + Thread Pool ---"
        );


        ExecutorService executor =
                Executors.newFixedThreadPool(3);


        for (int i = 1; i <= 5; i++) {

            int taskId = i;


            executor.submit(() -> {

                System.out.println(
                        "Task "
                                + taskId
                                + " executed by "
                                + Thread.currentThread().getName()
                );

            });
        }


        executor.shutdown();


        // Wait for all tasks
        executor.awaitTermination(
                5,
                TimeUnit.SECONDS
        );


        // =====================================================
        // 12. CALLABLE + FUTURE
        // =====================================================

        System.out.println(
                "\n--- 12. Callable + Future ---"
        );


        ExecutorService callableExecutor =
                Executors.newSingleThreadExecutor();


        Callable<Integer> calculationTask = () -> {

            System.out.println(
                    "Calculating on: "
                            + Thread.currentThread().getName()
            );

            return 10 + 20;
        };


        Future<Integer> future =
                callableExecutor.submit(calculationTask);


        System.out.println(
                "Callable Result: "
                        + future.get()
        );


        callableExecutor.shutdown();


        // =====================================================
        // 13. COMPLETABLE FUTURE
        // =====================================================

        System.out.println(
                "\n--- 13. CompletableFuture ---"
        );


        CompletableFuture<Void> completableFuture =

                CompletableFuture

                        .supplyAsync(() -> {

                            System.out.println(
                                    "Fetching data..."
                            );

                            return "Vijay";

                        })

                        .thenApply(name -> {

                            return "Hello " + name;

                        })

                        .thenAccept(result -> {

                            System.out.println(
                                    "Result: " + result
                            );

                        });


        // Wait for completion
        completableFuture.join();


        // =====================================================
        // 14. VIRTUAL THREADS - JAVA 21+
        // =====================================================

        System.out.println(
                "\n--- 14. Virtual Thread ---"
        );


        Thread virtualThread =

                Thread.startVirtualThread(() -> {

                    System.out.println(
                            "Virtual Thread: "
                                    + Thread.currentThread()
                    );

                });


        virtualThread.join();


        // =====================================================
        // PROGRAM COMPLETE
        // =====================================================

        System.out.println("\n========================================");

        System.out.println(
                " ALL MULTITHREADING DEMOS COMPLETED"
        );

        System.out.println("========================================");
    }
}