package OOP;

class Student{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

}

public  class Encapsulation {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("Vijay");
        s1.setAge(23);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());

    }
}