class Animalss{

    String color = "White";

}

class Dog extends Animalss{

    String color = "Black";

    void printColor(){

        System.out.println(super.color);

        System.out.println(color);

    }

}

public class super_Keyword {

    public static void main(String[] args){

        Dog d = new Dog();

        d.printColor();

    }

}