package Java_8.Predicator.Method;

import java.util.function.Predicate;

public class orMethod {
    public static void main(String[] args) {
        Predicate<String> isAdmin=role->role.equals("Admin");
        Predicate<String> isManager=role->role.equals("Manager");
        Predicate<String>hasAccess=isAdmin.or(isManager);
        System.out.println(hasAccess.test("ADMIM"));
        System.out.println(hasAccess.test("Manager"));
        System.out.println(hasAccess.test("User"));
        System.out.println(hasAccess.test("Vijay"));
    }
}
