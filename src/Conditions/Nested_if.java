package Conditions;

public class Nested_if {
    public static void main(String[] args) {

        int age = 20;
        boolean citizen = true;

        if(age >= 18){

            if(citizen){
                System.out.println("Eligible to Vote");
            }

        }
    }
}
