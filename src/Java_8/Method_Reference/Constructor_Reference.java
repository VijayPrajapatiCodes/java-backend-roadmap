package Java_8.Method_Reference;

import java.util.function.Supplier;

public class Constructor_Reference {

    public static void main(String[] args) {

        Supplier<User> createUser =
                User::new;

        User user = createUser.get();
    }
}

class User {

    public User() {
        System.out.println("User Created");
    }
}
