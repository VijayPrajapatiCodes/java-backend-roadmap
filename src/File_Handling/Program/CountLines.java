package File_Handling.Program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLines {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("Vijay.txt"));

        String line;
        int count = 0;

        while ((line = br.readLine()) != null) {
            count++;
        }

        br.close();

        System.out.println("Total Lines = " + count);
    }
}
