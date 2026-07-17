package File_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendData {
    public static void main(String[] args) throws IOException {
        FileWriter writer=new FileWriter("Vijay.txt",false);
        writer.write("\nWelcome Java Pagalu");
        writer.write("\nWelcome Java Pagalu 2");
        writer.close();
        System.out.println("Ho gya ");
        File file=new File("Vijay.txt");
        Scanner sc=new Scanner(file);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

        sc.close();
    }
}
