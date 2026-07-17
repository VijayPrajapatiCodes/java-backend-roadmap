package Collections;
import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {

        HashMap<Integer,String> students = new HashMap<>();

        students.put(101,"Vijay");
        students.put(102,"Rahul");
        students.put(103,"Aman");

        System.out.println(students);

        System.out.println(students.get(101));

        System.out.println(students.containsKey(102));

        System.out.println(students.containsValue("Rahul"));

        for(HashMap.Entry<Integer,String> entry : students.entrySet()){

            System.out.println(entry.getKey()+" : "+entry.getValue());

        }

    }

}