package Loop;

import java.util.Scanner;

public class Inputforloop {
    public static void main(String[] args) {
        System.out.println("Printing a number");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number which are you Printing ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }



    }
}
