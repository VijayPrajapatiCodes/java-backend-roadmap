package Array;

import java.util.Scanner;

public class Average_Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[10];
        int sum = 0;
        double average;

        System.out.println("Enter 10 Marks:");

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
            sum = sum + marks[i];
        }

        average = (double) sum / marks.length;

        System.out.println("Total Marks = " + sum);
        System.out.println("Average = " + average);

        sc.close();
    }
    }
