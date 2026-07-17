package OOP;

class Animals {

    void eat() {
        System.out.println("Animal Eats");
    }

}

class Dogs extends Animal {

    void bark() {
        System.out.println("Dog Barks");
    }

}

public class Single_Inheritance {

    public static void main(String[] args) {

        Dogs d = new Dogs();

        d.eat();
        d.bark();

    }

}