package Serialization;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class SerializationDemo {

    public static void main(String[] args) throws IOException {

        Student s1 = new Student(101, "Vijay", 91.5);

        FileOutputStream fos = new FileOutputStream("student.ser");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s1);

        oos.close();
        fos.close();

        System.out.println("Object Saved Successfully");
    }
}