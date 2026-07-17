import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Electricity Bill Payment =====");
        System.out.println("1. Domestic");
        System.out.println("2. Commercial");
        System.out.println("3. Industrial");
        System.out.print("Enter Connection Type: ");

        int choice = sc.nextInt();

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        double bill = 0;

        switch (choice) {

            case 1:
                bill = units * 5;
                System.out.println("Connection Type : Domestic");
                System.out.println("Rate : ₹5 per unit");
                System.out.println("Total Bill : ₹" + bill);
                break;

            case 2:
                bill = units * 8;
                System.out.println("Connection Type : Commercial");
                System.out.println("Rate : ₹8 per unit");
                System.out.println("Total Bill : ₹" + bill);
                break;

            case 3:
                bill = units * 10;
                System.out.println("Connection Type : Industrial");
                System.out.println("Rate : ₹10 per unit");
                System.out.println("Total Bill : ₹" + bill);
                break;

            default:
                System.out.println("Invalid Connection Type!");
        }

        sc.close();
    }
}