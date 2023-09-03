package Stream;

import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {
        // Exemplo 1: Reduzindo uma lista de números para a soma
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Optional<Integer> sumResult = numbers.stream()
                .reduce((accumulator, element) -> accumulator + element);

        Optional<Integer> maxValue = numbers.stream()
                .reduce(Integer::max);
        maxValue.ifPresent(result -> System.out.println("Maior valor: " + result));

        sumResult.ifPresent(result -> System.out.println("Soma dos números: " + result));

        // Exemplo 2: Reduzindo uma lista de strings para uma única string
        List<String> words = List.of("java", "stream", "api", "exemplo");
        Optional<String> concatResult = words.stream()
                .reduce((accumulator, element) -> accumulator + " " + element);

        concatResult.ifPresent(result -> System.out.println("Concatenação das palavras: " + result));

        List<Double> prices = List.of(10.5, 5.2, 8.0, 12.75, 9.99);
        // Usando reduce para calcular o valor total das compras
        double totalPrice = prices.stream()
                .reduce(0.0, (accumulator, price) -> accumulator + price);
        String formattedTotalPrice = String.format("%.2f", totalPrice);

        System.out.println("Valor total das compras: R$" + formattedTotalPrice);
    }
}
