package File_Handling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("Vijay Photo.jpeg");
        FileOutputStream fos = new FileOutputStream("copy.jpeg");

        int data;

        while ((data = fis.read()) != -1) {
            fos.write(data);
        }

        fis.close();
        fos.close();

        System.out.println("Image Copied Successfully");
    }
}