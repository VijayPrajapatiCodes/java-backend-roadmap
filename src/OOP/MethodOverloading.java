package OOP;
class Calculator{

    void add(int a,int b){

        System.out.println(a+b);

    }

    void add(int a,int b,int c){

        System.out.println(a+b+c);

    }

}

public class MethodOverloading {

    public static void main(String[] args){

        Calculator c = new Calculator();

        c.add(10,20);

        c.add(10,20,30);

    }

}