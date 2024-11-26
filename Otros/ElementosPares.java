import java.util.*;
import java.util.stream.Collectors;

public class ElementosPares {

    public static <T> List<T> elementosConRepeticionesPares(T[] array) {
        Map<T, Long> conteo = Arrays.stream(array)
            .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        return conteo.entrySet().stream()
            .filter(entry -> entry.getValue() % 2 == 0) // Filtra los elementos con conteo par
            .map(Map.Entry::getKey) // Obtén solo las claves
            .collect(Collectors.toList()); // Convierte en lista
    }

    public static void main(String[] args) {
        // Ejemplos
        String[] array1 = {"A", "B", "A", "C", "C", "C", "C"};
        System.out.println(elementosConRepeticionesPares(array1)); // [A, C]

        Integer[] array2 = {1, 2, 3, 1, 2};
        System.out.println(elementosConRepeticionesPares(array2)); // [1, 2]
    }
}
