package Programm;

import java.util.Scanner;

public class Leap_Year {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter a year: ");
            int year = sc.nextInt();

            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }

            System.out.print("Do you want to check another year? (Y/N): ");
            char choice = sc.next().charAt(0);

            if (choice == 'N' || choice == 'n') {
                System.out.println("Thank You!");
                break;
            }
        }

        sc.close();
    }
}