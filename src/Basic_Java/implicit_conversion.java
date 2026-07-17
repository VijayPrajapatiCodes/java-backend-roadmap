package Basic_Java;

public class implicit_conversion {
    public static  void main(String[] args){
        int count=12;
        long counts=count;
        int a=10;
        double b=a;
        System.out.println(b);
        System.out.println(((Object)counts).getClass().getSimpleName());
    }
}
