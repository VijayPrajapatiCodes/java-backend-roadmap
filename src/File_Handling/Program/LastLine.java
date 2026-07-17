package File_Handling.Program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LastLine {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("Vijay.txt"));

        String line;
        String lastLine = "";

        while ((line = br.readLine()) != null) {
            lastLine = line;
        }

        br.close();

        System.out.println("Last Line : " + lastLine);
    }
}