package Java_8.STREAM_API.Filter.UserObjectProgram;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(

                new User("Vijay",22),
                new User("Rahul",17),
                new User("Aman",19),
                new User("Rohit",15)

        );
        users.stream().filter(user->user.getAge()>=18)
                .forEach(user -> System.out.println(user.getName()));
    }
}
