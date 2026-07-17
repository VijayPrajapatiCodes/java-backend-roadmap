package Multithreading;

import Multithreading.MyThread;

public class Main {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyTask   ts = new MyTask();


        t1.start();
        t2.start();

    }
}