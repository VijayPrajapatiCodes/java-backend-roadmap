package Programm;

import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a first number");
        int a=sc.nextInt();
        System.out.println("Enter a Second number");
        int b=sc.nextInt();
        if(a>b){
            System.out.println(a +" "+"is a largest number");
        }else if(a<b){
            System.out.println(b+" "+"is a largest number");
        }
        else{
            System.out.println("both  number is equal");
        }
        sc.close();
    }
}
