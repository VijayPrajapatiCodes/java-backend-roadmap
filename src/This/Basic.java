package This;

class Employee{

    int id;

    String name;

    Employee(int id,String name){

        this.id = id;

        this.name = name;

    }

    void display(){

        System.out.println(id);

        System.out.println(name);

    }

}

public class Basic {

    public static void main(String[] args){

        Employee e1 = new Employee(101,"Rahul");

        e1.display();

    }

}