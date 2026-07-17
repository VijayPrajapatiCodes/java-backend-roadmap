package Array;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;

        System.out.println("Enter 5 Numbers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
