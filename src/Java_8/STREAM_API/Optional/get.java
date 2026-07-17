package Java_8.STREAM_API.Optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class get {
    public static void main(String[] args) {
        Optional<String>name= Optional.of("VIjay");
        System.out.println(name.get());
    }
}
