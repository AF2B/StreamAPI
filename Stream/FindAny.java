package Stream;

import java.util.List;
import java.util.Optional;

public class FindAny {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 5, 6, 7, 9, 10);

        // Encontrando qualquer número par (ou -1 se não houver)
        Optional<Integer> anyEven = numbers.stream()
                .filter(number -> number % 2 == 0)
                .findAny();

        anyEven.ifPresentOrElse(
                even -> System.out.println("Número par encontrado: " + even),
                () -> System.out.println("Nenhum número par encontrado."));
    }
}
