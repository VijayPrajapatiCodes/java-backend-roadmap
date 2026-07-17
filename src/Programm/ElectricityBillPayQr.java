import java.io.File;
import java.util.Scanner;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.client.j2se.MatrixToImageWriter;

public class ElectricityBillPayQr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("   ELECTRICITY BILL PAYMENT");
        System.out.println("=================================");

        System.out.println("1. Domestic");
        System.out.println("2. Commercial");
        System.out.println("3. Industrial");
        System.out.print("Enter Connection Type : ");

        int choice = sc.nextInt();

        System.out.print("Enter Units Consumed : ");
        int units = sc.nextInt();

        double bill = 0;

        switch (choice) {

            case 1:
                bill = units * 5;
                System.out.println("\nConnection Type : Domestic");
                System.out.println("Rate : ₹5 per unit");
                break;

            case 2:
                bill = units * 8;
                System.out.println("\nConnection Type : Commercial");
                System.out.println("Rate : ₹8 per unit");
                break;

            case 3:
                bill = units * 10;
                System.out.println("\nConnection Type : Industrial");
                System.out.println("Rate : ₹10 per unit");
                break;

            default:
                System.out.println("Invalid Connection Type!");
                sc.close();
                return;
        }

        System.out.println("---------------------------------");
        System.out.println("Total Bill Amount : ₹" + bill);
        System.out.println("---------------------------------");

        // Dummy UPI URI (demo)
        String upi = "upi://pay?pa=9205483945@upi"
                + "&pn=ElectricityBill"
                + "&am=" + bill
                + "&cu=INR"
                + "&tn=Electricity Bill Payment";

        System.out.println("\nGenerating QR Code...");

        generateQRCode(upi);

        System.out.println("=================================");
        System.out.println("QR Generated Successfully!");
        System.out.println("File : PaymentQR.png");
        System.out.println("Scan the QR using any UPI App.");
        System.out.println("=================================");

        while (true) {

            System.out.println("\n1. Demo: I Have Completed Payment");
            System.out.println("2. Cancel Payment");
            System.out.print("Enter Choice : ");

            int paymentChoice = sc.nextInt();

            switch (paymentChoice) {

                case 1:

                    System.out.println("\nChecking...");
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                    }

                    System.out.println("\n************************************");
                    System.out.println("   PAYMENT CONFIRMATION (DEMO)");
                    System.out.println("************************************");
                    System.out.println("Amount : ₹" + bill);
                    System.out.println("Status : PAID (DEMO)");
                    System.out.println("************************************");

                    sc.close();
                    return;

                case 2:

                    System.out.println("Payment Cancelled.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    public static void generateQRCode(String data) {

        try {

            BitMatrix matrix = new MultiFormatWriter().encode(
                    data,
                    BarcodeFormat.QR_CODE,
                    350,
                    350);

            MatrixToImageWriter.writeToPath(
                    matrix,
                    "PNG",
                    new File("PaymentQR.png").toPath());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}