package Stream;

import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AllMatch {
    public static void main(String[] args) {
        IntStream listOfNumbers = IntStream.range(1, 11);
        Vector<Integer> v = listOfNumbers
                .boxed()
                .collect(Collectors.toCollection(Vector::new));
        System.out.println("Todos os números são pares? " + isAllEven(v));
        System.out.println("Todos os números são ímpares? " + isAllOdd(v));
        System.out.println("Todos os números são pares? " + isOnlyEvenNumbers(v));
    }

    private static boolean isAllEven(Vector<Integer> vector) {
        return vector.stream()
                .allMatch(number -> number % 2 == 0);
    }

    private static boolean isAllOdd(Vector<Integer> vector) {
        return vector.stream()
                .allMatch(number -> number % 2 != 0);
    }

    private static boolean isOnlyEvenNumbers(Vector<Integer> vector) {
        return vector.stream()
                .filter(number -> number % 2 == 0)
                .allMatch(number -> number % 2 == 0);
    }
}
