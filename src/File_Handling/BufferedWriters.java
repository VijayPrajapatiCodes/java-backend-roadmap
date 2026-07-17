package File_Handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriters {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("Vijay.txt"));
        bw.write("Hello Vijay");
        bw.newLine();
        bw.write("Welcome Java");
        bw.close();
        System.out.println("Data Written Successfully");

    }
}
