package File_Handling.Program;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("Vijay.txt"));

        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}