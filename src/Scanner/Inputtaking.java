package Scanner;
import  java.util.Scanner;

public class Inputtaking {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num =sc.nextInt();
        sc.nextLine();
        System.out.println("Your enter num is " + num);
        String name=sc.nextLine();
        System.out.println("Your enter name is" + name);

        sc.close();

    }
}
