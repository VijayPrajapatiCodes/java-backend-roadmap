package Java_8.STREAM_API.Optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class ofNullable {
    public static void main(String[] args) {
        String name=null;
        Optional<String> result=Optional.ofNullable(name);
        System.out.println(result);
    }
}
