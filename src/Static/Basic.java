package Static;

class Student{

    String name;

    static String college = "RR Group";

}

public class Basic {

    public static void main(String[] args){

        Student s1 = new Student();

        Student s2 = new Student();

        s1.name = "Vijay";

        s2.name = "Rahul";

        System.out.println(s1.name);

        System.out.println(Student.college);

        System.out.println(s2.name);

        System.out.println(Student.college);

    }

}