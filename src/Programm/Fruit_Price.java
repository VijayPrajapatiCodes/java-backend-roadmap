package Programm;

import java.util.Scanner;

public class Fruit_Price {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Apple");
        System.out.println("2. Mango");
        System.out.println("3. Banana");
        System.out.println("Choose  Fruits");
        int fruits=sc.nextInt();
        switch (fruits){
            case 1:
                System.out.println("Apple Prize 120");
                break;
            case 2:
                System.out.println("Mango Prize 80");
                break;
            case 3:
                System.out.println("Banana Prize 60");
                break;
            default:
                System.out.println("Invalid Choose");

    }
}
}