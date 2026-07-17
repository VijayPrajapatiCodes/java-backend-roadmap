package File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaders {
    public static void main(String[] args) throws IOException {
        BufferedReader bw=new BufferedReader(new FileReader("Vijay.txt"));
        String line;
        while((line=bw.readLine())!=null){
            System.out.println(line);
        }
     bw.close();
    }
}
