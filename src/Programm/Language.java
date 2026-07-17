package Programm;

import java.util.Scanner;

public class Language {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Hindi");
        System.out.println("2. English");
        System.out.println("3. French");

        int lang = sc.nextInt();

        switch (lang) {

            case 1:
                System.out.println("Namaste");
                break;

            case 2:
                System.out.println("Hello");
                break;

            case 3:
                System.out.println("Bonjour");
                break;

            default:
                System.out.println("Language Not Found");
        }
    }
}