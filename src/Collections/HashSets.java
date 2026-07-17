package Collections;

import java.util.HashSet;

public class HashSets {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Spring");
        set.add("React");
        set.add("Java");

        System.out.println("HashSet : " + set);

        System.out.println("Contains Java : " + set.contains("Java"));

        set.remove("React");

        System.out.println("After Remove : " + set);

        System.out.println("Size : " + set.size());

    }

}