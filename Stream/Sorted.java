package Stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        // Exemplo 1: Ordenando uma lista de números em ordem natural
        List<Integer> numbers = List.of(5, 2, 8, 1, 4, 9, 3);
        List<Integer> sortedNumbers = sortInNaturalOrder(numbers);
        sortedNumbers.forEach(System.out::println);

        // Exemplo 2: Ordenando uma lista de strings em ordem alfabética
        List<String> words = List.of("java", "stream", "api", "exemplo");
        List<String> sortedWords = sortInAlphabeticalOrder(words);
        sortedWords.forEach(System.out::println);

        // Exemplo 3: Ordenando uma lista de objetos personalizados com um comparador
        List<Person> people = List.of(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 22));
        List<Person> sortedPeople = sortByAge(people);
        sortedPeople.forEach(System.out::println);
    }

    // Exemplo de uso de sorted para ordenar números em ordem natural
    public static List<Integer> sortInNaturalOrder(List<Integer> numbers) {
        return numbers.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    // Exemplo de uso de sorted para ordenar palavras em ordem alfabética
    public static List<String> sortInAlphabeticalOrder(List<String> words) {
        return words.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    // Exemplo de uso de sorted com um comparador para ordenar objetos
    // personalizados
    public static List<Person> sortByAge(List<Person> people) {
        Comparator<Person> ageComparator = Comparator.comparingInt(Person::getAge);
        return people.stream()
                .sorted(ageComparator)
                .collect(Collectors.toList());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
