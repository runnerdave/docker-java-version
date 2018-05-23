import java.util.List;

public class Hello_java10 {
    public static void main(String[] args) {
        System.out.println("Java 10 example: Local-Variable Type Inference");
        var numbers = List.of(1, 2, 3, 4, 5); // inferred value ArrayList<String>
        // Index of Enhanced For Loop
        for (var number : numbers) {
            System.out.println(number);
        }
        // Local variable declared in a loop
        for (var i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}