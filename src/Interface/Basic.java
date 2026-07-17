package Interface;

interface Animal{

    void sound();

}

class Dog implements Animal{

    @Override
    public void sound(){

        System.out.println("Dog Barks");

    }

}

public class Basic{

    public static void main(String[] args){

        Dog d = new Dog();

        d.sound();

    }

}