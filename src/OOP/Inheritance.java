package OOP;

class Animal {

    void eat() {
        System.out.println("Animal Eats");
    }

}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog Barks");
    }

}

public class Inheritance {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.bark();

    }

}