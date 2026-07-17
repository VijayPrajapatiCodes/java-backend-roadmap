package File_Handling.Program;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("Vijay.txt"));

        bw.write("Hello Vijay");
        bw.newLine();

        bw.write("Welcome Java");
        bw.newLine();

        bw.write("Spring Boot");
        bw.newLine();

        bw.write("React JS");
        bw.newLine();

        bw.write("Full Stack Developer");

        bw.close();

        System.out.println("Data Written Successfully");
    }
}