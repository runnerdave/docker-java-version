import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Hello_java11 {
    static boolean fourDigit(String name) {
        return name.length() == 4;
    }

    public static void main(String[] args) {
        System.out.println("Java 11 example: JEP 323: Local-Variable Syntax for Lambda Parameters");
        List<String> names = Arrays.asList("Pedro", "Juan", "Maria");
        System.out.println(names);
        System.out.println(names.stream().filter((var name) -> fourDigit(name)).collect(Collectors.toList()));
    }
}