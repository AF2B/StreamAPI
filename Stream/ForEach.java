package Stream;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        // Exemplo 1: Imprimindo elementos de uma lista
        List<String> words = List.of("java", "stream", "api", "exemplo");
        words.stream()
                .forEach(word -> System.out.println("Palavra: " + word));

        // Exemplo 2: Realizando alguma ação em números
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        numbers.stream()
                .forEach(num -> {
                    int squared = num * num;
                    System.out.println(num + " ao quadrado: " + squared);
                });
    }
}
