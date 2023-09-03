package Stream;

import java.util.List;

public class AnyMatch {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("John", 78),
                new Student("Bob", 42),
                new Student("Charlie", 95),
                new Student("David", 58));

        // Verificando se pelo menos um estudante passou no exame
        boolean isSixteenHigherScore = students.stream()
                .anyMatch(student -> student.getScore() >= 60);

        if (isSixteenHigherScore) {
            System.out.println("Pelo menos um estudante passou no exame.");
        } else {
            System.out.println("Nenhum estudante passou no exame.");
        }

        boolean isSomeStudentStartWithJ = students.stream()
                .anyMatch(student -> student.getName().startsWith("J"));

        if (isSomeStudentStartWithJ) {
            System.out.println("Pelo menos um estudante começa com a letra J.");
        } else {
            System.out.println("Nenhum estudante começa com a letra J.");
        }

        boolean isLessThanFifty = students.stream()
                .anyMatch(student -> student.getScore() < 50);

        if (isLessThanFifty) {
            System.out.println("Pelo menos um estudante tirou menos que 50.");
        } else {
            System.out.println("Nenhum estudante tirou menos que 50.");
        }
    }
}

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }
}
