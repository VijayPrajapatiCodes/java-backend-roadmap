package File_Handling;

import java.io.FileWriter;
import java.io.IOException;

public class writer_File {
    public static void main(String[] args)throws IOException {
        FileWriter writer=new FileWriter("Vijay.txt");
        writer.write("Hello Thala Pagalu");
        writer.close();
        System.out.println("Data Written");

    }
}
