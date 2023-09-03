package Stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        // Exemplo 1: Filtrando números pares
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = filterEvenNumbers(numbers);
        System.out.println("Números Pares: " + evenNumbers);

        // Exemplo 2: Filtrando nomes com mais de 5 letras
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");
        List<String> longNames = filterLongNames(names);
        System.out.println("Nomes com mais de 5 letras: " + longNames);
    }

    // Método de exemplo para filtrar números pares
    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
    }

    // Método de exemplo para filtrar nomes com mais de 5 letras
    public static List<String> filterLongNames(List<String> names) {
        Predicate<String> isLongName = name -> name.length() > 5;
        return names.stream()
                .filter(isLongName)
                .collect(Collectors.toList());
    }
}
