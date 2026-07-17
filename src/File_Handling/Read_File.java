package File_Handling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read_File {
    public static void main(String[] args) throws IOException {
        File file =new File("Vijay.txt");
        Scanner sc=new Scanner(file);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();

    }
}
