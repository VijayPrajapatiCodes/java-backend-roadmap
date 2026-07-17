package Programm;

import java.util.Scanner;

public class Even_Odd_Professionally {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println("Number is Even");
            } else {
                System.out.println("Number is Odd");
            }

            System.out.print("Do you want to check another number? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("Thank You!");

        sc.close();
    }
}