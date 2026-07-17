package Serialization;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class DeserializationDemo {

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("student.ser");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s = (Student) ois.readObject();

        ois.close();
        fis.close();

        System.out.println("ID : " + s.id);
        System.out.println("Name : " + s.name);
        System.out.println("Marks : " + s.marks);

    }
}