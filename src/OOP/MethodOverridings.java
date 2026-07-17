package OOP;

class Animaling{

    void sound(){

        System.out.println("Animal Makes Sound");

    }

}

class Doging extends Animaling{

    @Override
    void sound(){

        System.out.println("Dog Barks");

    }

}

public class MethodOverridings{

    public static void main(String[] args){

        Doging d = new Doging();

        d.sound();

    }

}