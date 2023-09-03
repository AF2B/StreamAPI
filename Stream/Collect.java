package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        List<String> words = List.of("java", "stream", "api", "exemplo");

        // Coletando os elementos em uma única string separada por vírgulas
        String collectedString = words.stream()
                .collect(Collectors.joining(", "))
                .toUpperCase()
                .concat("!!!");
        System.out.println("String coletada: " + collectedString);

        List<String> emails = List.of("user1@example.com", "user2.com", "user3@example.com", "user4@gmail.com");
        // Coletando emails válidos em uma lista
        List<String> validEmails = emails.stream()
                .filter(email -> handleValidEmail(email))
                .collect(Collectors.toList());

        System.out.println("Emails válidos: " + validEmails);

        String text = "Este é um exemplo de texto com palavras únicas. Este texto é apenas um exemplo.";
        final Set<String> uniqueWords = Arrays.stream(text.split(" "))
                .map(word -> word.replaceAll("\\.", ""))
                .filter(word -> !word.isEmpty())
                .distinct()
                .collect(Collectors.toSet());
        System.out.println("Palavras únicas: " + uniqueWords);

    }

    private final static Boolean handleValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }
}
