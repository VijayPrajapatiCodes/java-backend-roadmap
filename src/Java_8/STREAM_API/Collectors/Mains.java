package Java_8.STREAM_API.Collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Mains {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Rahul", "Java"),
                new Student("Amit", "Java"),
                new Student("Riya", "Python"),
                new Student("Neha", "Java"),
                new Student("Ankit", "Python"));

        Map<String, List<Student>> departmentbyData = students.stream().collect(Collectors.groupingBy(Student::getDepartment));
        System.out.println(departmentbyData);
    }
}
