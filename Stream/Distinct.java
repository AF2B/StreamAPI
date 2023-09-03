package Stream;

import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        // Exemplo 1: Removendo elementos duplicados de uma lista
        List<Integer> numbersWithDuplicates = List.of(1, 2, 2, 3, 4, 4, 5, 5);
        List<Integer> distinctNumbers = removeDuplicates(numbersWithDuplicates);
        System.out.println("Números distintos: " + distinctNumbers);

        // Exemplo 2: Removendo palavras duplicadas de uma lista de strings
        List<String> wordsWithDuplicates = List.of("java", "stream", "java", "api", "stream");
        List<String> distinctWords = removeDuplicateWords(wordsWithDuplicates);
        System.out.println("Palavras distintas: " + distinctWords);
    }

    // Exemplo de uso de distinct para remover elementos duplicados de uma lista de
    // inteiros
    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    // Exemplo de uso de distinct para remover palavras duplicadas de uma lista de
    // strings
    public static List<String> removeDuplicateWords(List<String> words) {
        return words.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
