package Java_8;

public class EmployeeLambda {
    public static void main(String[] args) {
        Employee se=()->"Vijay Prajapati SDE";
        System.out.println(se.getName());
    }
}
