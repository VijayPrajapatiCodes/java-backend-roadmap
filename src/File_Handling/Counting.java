package File_Handling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) throws IOException {
        File file=new File("Vijay.txt");
        Scanner sc =new Scanner(file);
        int count=0;
        while (sc.hasNextLine()){
            String line=sc.nextLine();
            count+=line.length();
            System.out.println(line);
        }
        sc.close();
        System.out.println("Total Character ="+ count);

    }
}
