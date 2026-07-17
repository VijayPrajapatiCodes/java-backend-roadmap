package Programm;

import Conditions.Switch_Statement;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks=sc.nextInt();
        if (marks>=90){
            System.out.println("A Grade");
        } else if (marks>=80) {
            System.out.println("B Grade");
        } else if (marks>60) {
            System.out.println("C Grade");

        } else if (marks>=34) {
            System.out.println("D Grade");

        } else if (marks<33){
            System.out.println("Fail");
        }
    }
}
