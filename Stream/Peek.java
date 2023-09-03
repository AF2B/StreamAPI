package Stream;

import java.util.List;

public class Peek {
    public static void main(String[] args) {
        // Exemplo 1: Imprimindo elementos de uma lista enquanto filtramos
        List<String> words = List.of("java", "stream", "api", "exemplo");
        words.stream()
                .filter(word -> word.length() > 3)
                .peek(word -> System.out.println("Filtrado: " + word))
                .forEach(System.out::println);

        // Exemplo 2: Multiplicando números por 2 e imprimindo cada passo
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        numbers.stream()
                .map(num -> num * 2)
                .peek(result -> System.out.println("Resultado: " + result))
                .forEach(System.out::println);
    }
}
