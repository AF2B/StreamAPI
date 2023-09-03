package Stream;

import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMap {
    public static void main(String[] args) {
        // Exemplo 1: Transformando uma lista de números em seus quadrados usando map
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> squares = mapToSquares(numbers);
        System.out.println("Quadrados dos números: " + squares);

        // Exemplo 2: Transformando uma lista de palavras em caracteres usando flatMap
        List<String> words = List.of("java", "stream", "api");
        List<Character> characters = flatMapToCharacters(words);
        System.out.println("Caracteres das palavras: " + characters);
    }

    // Exemplo de uso de map para calcular quadrados de números
    public static List<Integer> mapToSquares(List<Integer> numbers) {
        return numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
    }

    // Exemplo de uso de flatMap para obter caracteres de palavras
    public static List<Character> flatMapToCharacters(List<String> words) {
        return words.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());
    }
}
