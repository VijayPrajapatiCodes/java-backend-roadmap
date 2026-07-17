package File_Handling.Program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FirstLine {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("Vijay.txt"));

        String line = br.readLine();

        System.out.println("First Line : " + line);

        br.close();
    }
}