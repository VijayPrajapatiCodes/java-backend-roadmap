package Collections;


import java.util.LinkedList;
import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<String> names = new LinkedList<>();

        System.out.println("Enter 5 Names:");

        // Input
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Name " + i + ": ");
            names.add(sc.nextLine());
        }

        System.out.println("\nNames are:");

        // Output
        for (String name : names) {
            System.out.println(name);

        }
        System.out.println("Contains Java : " + names.contains("Java"));
        sc.close();
    }
}