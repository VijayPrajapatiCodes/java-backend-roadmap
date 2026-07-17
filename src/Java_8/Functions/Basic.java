package Java_8.Functions;


import java.util.function.Function;

public class Basic {
    public static void main(String[] args) {
        Function<String,Integer> getLenght= name->name.length();
        System.out.println(getLenght.apply("Vijay Prajapati"));

    }
}
