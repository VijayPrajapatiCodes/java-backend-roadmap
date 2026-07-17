package Collections;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Spring Boot");
        list.add("React");

        System.out.println("Original List : " + list);

        System.out.println("First Element : " + list.get(0));

        list.set(1,"Spring");

        System.out.println("After Update : " + list);

        list.remove(2);

        System.out.println("Aft" +
                "er Remove : " + list);

        System.out.println("Size : " + list.size());

        System.out.println("Contains Java : " + list.contains("Java"));

    }

}
