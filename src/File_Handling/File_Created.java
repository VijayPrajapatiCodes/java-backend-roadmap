package File_Handling;

import java.io.File;
import java.io.IOException;

public class File_Created {
    public static void main(String[] args) throws IOException {
        File file=new File("Vijay.txt");
        if(file.createNewFile()){
            System.out.println("File Created");
        }
        else {
            System.out.println("Already Exist");
        }
    }
}
