# 30 Principais Métodos da Stream API em Java

A Stream API em Java oferece uma variedade de métodos para realizar operações de processamento de dados em coleções e sequências. Aqui estão os principais métodos da Stream API e uma breve descrição do que cada um faz:

1. **`filter(Predicate<T> predicate)`**:
   - Filtra elementos com base em um predicado.

2. **`map(Function<T, R> mapper)`**:
   - Transforma cada elemento do stream aplicando uma função.

3. **`flatMap(Function<T, Stream<R>> mapper)`**:
   - Mapeia cada elemento do stream para zero ou mais elementos usando uma função.

4. **`distinct()`**:
   - Remove elementos duplicados do stream.

5. **`sorted()`**:
   - Ordena os elementos do stream em ordem natural.

6. **`sorted(Comparator<T> comparator)`**:
   - Ordena os elementos do stream com base em um comparador personalizado.

7. **`peek(Consumer<T> action)`**:
   - Realiza uma operação de ação não interferente em cada elemento do stream.

8. **`forEach(Consumer<T> action)`**:
   - Executa uma ação para cada elemento do stream.

9. **`toArray()`**:
   - Converte o stream em um array.

10. **`reduce(BinaryOperator<T> accumulator)`**:
    - Combina todos os elementos do stream em um único resultado.

11. **`collect(Collector<T, A, R> collector)`**:
    - Coleta os elementos do stream em uma coleção ou em outro tipo de objeto especificado pelo coletor.

12. **`min(Comparator<T> comparator)`**:
    - Encontra o menor elemento do stream com base no comparador fornecido.

13. **`max(Comparator<T> comparator)`**:
    - Encontra o maior elemento do stream com base no comparador fornecido.

14. **`count()`**:
    - Retorna o número de elementos no stream.

15. **`anyMatch(Predicate<T> predicate)`**:
    - Verifica se pelo menos um elemento atende ao predicado.

16. **`allMatch(Predicate<T> predicate)`**:
    - Verifica se todos os elementos atendem ao predicado.

17. **`noneMatch(Predicate<T> predicate)`**:
    - Verifica se nenhum elemento atende ao predicado.

18. **`findFirst()`**:
    - Encontra o primeiro elemento no stream.

19. **`findAny()`**:
    - Encontra qualquer elemento no stream.

20. **`iterator()`**:
    - Obtém um iterator para percorrer os elementos do stream.

21. **`spliterator()`**:
    - Obtém um Spliterator para percorrer os elementos do stream.

22. **`isParallel()`**:
    - Verifica se o stream é paralelo.

23. **`sequential()`**:
    - Converte um stream paralelo em um stream sequencial.

24. **`parallel()`**:
    - Converte um stream sequencial em um stream paralelo.

25. **`close()`**:
    - Fecha o stream.

26. **`toArray(IntFunction<A[]> generator)`**:
    - Converte o stream em um array usando um gerador de matriz.

27. **`forEachOrdered(Consumer<T> action)`**:
    - Executa uma ação para cada elemento no stream, mantendo a ordem.

28. **`unordered()`**:
    - Indica que a ordem dos elementos no stream não é significativa.

29. **`isParallel()`**:
    - Verifica se o stream é paralelo.

30. **`sequential()`**:
    - Converte um stream paralelo em um stream sequencial.
