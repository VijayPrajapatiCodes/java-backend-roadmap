package Array;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] marks= new int[5];
        System.out.println("Enter 5 marks");
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("Enter the marks Successfully");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println(marks.length);
    }

}
