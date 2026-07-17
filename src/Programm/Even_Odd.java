package Programm;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      while (true){
            System.out.println("Enter a for checking a Even and Odd");


        int num=sc.nextInt();
        if(num % 2 == 0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is odd");
        }

    }
    }
}


/*Interview Question 😎

Interviewer:

Why did you use % operator?

Answer:

The modulus operator (%) returns the remainder after division. If a number is divisible by 2 and the remainder is 0, then the number is even; otherwise, it is odd.*/
