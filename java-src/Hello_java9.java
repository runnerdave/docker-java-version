import java.util.List;
public class Hello_java9 {
    public static void main(String[] args) {
        System.out.println("Java 9 example: immutable collections");
        List<String> listOfFour = List.of("One", "Two", "Three", "Four");
        System.out.println(listOfFour);
    }
}