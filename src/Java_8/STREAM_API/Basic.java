package Java_8.STREAM_API;

import Serialization.Student;

import java.util.List;

public class Basic {
    public static void main(String[] args) {
        List<String> student=List.of("Vijay","Rohit","Shyam","Samrin","Keshav","Dube");
//        for(String name : student){
//            System.out.println(name);
//        }
        student.stream().forEach(System.out::println);

    }
}
