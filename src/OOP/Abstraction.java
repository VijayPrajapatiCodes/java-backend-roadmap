package OOP;

abstract class Anima{

    abstract void sound();

}

class Do extends Anima{

    @Override
    void sound(){

        System.out.println("Dog Barks");

    }

}

public class Abstraction{

    public static void main(String[] args){

        Do d = new Do();

        d.sound();

    }

}