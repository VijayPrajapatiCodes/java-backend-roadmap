package Basic_Java;

public class typesofcheck {
    public  static void main(String[] args){
        int a = 10;
        double b = 20.5;
        char c = 'A';
        boolean d = true;
        String e = "Hello";

        System.out.println(((Object)a).getClass().getSimpleName()); // Integer
        System.out.println(((Object)b).getClass().getSimpleName()); // Double
        System.out.println(((Object)c).getClass().getSimpleName()); // Character
        System.out.println(((Object)d).getClass().getSimpleName()); // Boolean
        System.out.println(e.getClass().getSimpleName());           // String
    }
}
