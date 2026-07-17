package File_Handling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("Vijay.txt");

        int ch;

        while ((ch = fis.read()) != -1) {
            System.out.print((char) ch);
        }

        fis.close();
    }
}