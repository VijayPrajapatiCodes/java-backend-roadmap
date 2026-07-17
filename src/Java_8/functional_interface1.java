package Java_8;

public interface functional_interface1 {
    int Calculator(int a,int b);
    static Calculator addition=
            (a,b)-> a+b;

    public static void main(String[] args) {
        System.out.println( addition.calculate(82,95));;
    }

}
