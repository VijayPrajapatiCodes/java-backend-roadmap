import java.util.Scanner;

public class Menus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Login Successful");
                break;

            case 2:
                System.out.println("Registration Open");
                break;

            case 3:
                System.out.println("Good Bye");
                break;

            default:
                System.out.println("Wrong Choice");
        }
    }
}