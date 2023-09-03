package Stream;

import java.util.List;

public class toArray {
    public static void main(String[] args) {
        // Exemplo 1: Convertendo elementos de um stream em um array
        List<String> words = List.of("java", "stream", "api", "exemplo");
        Object[] wordArray = words.stream()
                .toArray();

        System.out.println("Array de palavras:");
        for (Object word : wordArray) {
            System.out.println(word);
        }

        // Exemplo 2: Convertendo elementos de um stream em um array específico
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Integer[] numberArray = numbers.stream()
                .toArray(Integer[]::new);

        System.out.println("Array de números:");
        for (Integer num : numberArray) {
            System.out.println(num);
        }
    }
}
