package Object;

class Student {

    String name;

    int age;

}

public class Main {

    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Vijay";
        s1.age=15;
        System.out.println(s1.name);
        System.out.println(s1.age);
    }

}