package File_Handling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("Vijay.txt");

        String data = "Hello Vijay";

        fos.write(data.getBytes());

        fos.close();

        System.out.println("Data Written Successfully");
    }
}