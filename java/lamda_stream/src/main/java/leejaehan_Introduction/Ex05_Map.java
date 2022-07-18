package leejaehan_Introduction;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Ex05_Map {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana", "orange");

        list.stream()
                .map(s-> s.toLowerCase())
                .forEach(n -> System.out.println(n+ "\t"));
        System.out.println();
    }
}
