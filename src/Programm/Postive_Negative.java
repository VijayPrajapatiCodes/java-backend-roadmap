package Programm;

import java.util.Scanner;

public class Postive_Negative {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number checking for negetive and postive ");
        int num =sc.nextInt();
        if(num>0){
            System.out.println("Numb is a Positive");
        }
        else if(num<0){
            System.out.println("Numb is a negative ");
        }
        else {
            System.out.println("Number is Zero");
        }
        sc.close();
    }
}
