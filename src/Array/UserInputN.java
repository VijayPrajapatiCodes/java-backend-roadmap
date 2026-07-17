package Array;

import java.util.Scanner;

public class UserInputN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size : ");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Elements");

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements Are");

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}