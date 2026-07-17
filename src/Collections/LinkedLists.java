package Collections;

import java.util.LinkedList;

public class LinkedLists {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Spring");
        list.add("React");

        list.addFirst("Python");
        list.addLast("MySQL");

        System.out.println(list);

        System.out.println(list.getFirst());

        System.out.println(list.getLast());

        list.removeFirst();

        System.out.println(list);

    }

}
