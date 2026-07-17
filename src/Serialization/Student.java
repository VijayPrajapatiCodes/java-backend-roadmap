package Serialization;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    int id;
    String name;
    transient double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}
