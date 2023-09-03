package Stream;

import java.util.Optional;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindFirst {
    public static void main(String[] args) {
        IntStream listOfNumbers = IntStream.range(1, 11);
        Vector<Integer> v = listOfNumbers.boxed()
                .collect(Collectors.toCollection(Vector::new));
        Vector<Integer> oddVector = v.stream()
                .filter(number -> number % 2 != 0)
                .collect(Collectors.toCollection(Vector::new));
        Optional<Integer> firstOddNumber = oddVector.stream()
                .findFirst();

        firstOddNumber.ifPresentOrElse(
                value -> System.out.println("O primeiro número ímpar é " + value),
                () -> System.out.println("Não há números ímpares no vetor"));
    }
}
