package Programm;

import java.util.Scanner;

public class largestOfthree {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a first number");
    int a=sc.nextInt();
    System.out.println("Enter b Second number");
    int b=sc.nextInt();
    System.out.println("Enter c Second number");
    int c=sc.nextInt();
    if(a > b && a > c){
        System.out.println(a +" "+"is a largest number");
    }else if(b > a && b > c){
        System.out.println(b+" "+"is a largest number");
    } else if (c > a && c > b) {
        System.out.println(c+" "+"is a largest number");
    } else{
        System.out.println("both  number is equal");
    }
    sc.close();
}
}
