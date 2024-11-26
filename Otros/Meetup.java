



    import java.util.*;

public class Meetup {

    public static boolean continentesRepresentados(List<Map<String, String>> lista) {
        Set<String> continentesNecesarios = new HashSet<>(Arrays.asList("Africa", "Americas", "Asia", "Europe", "Oceania"));
        Set<String> continentesPresentes = new HashSet<>();
        
        for (Map<String, String> persona : lista) {
            continentesPresentes.add(persona.get("continent"));
        }
        
        return continentesPresentes.containsAll(continentesNecesarios);
    }

    public static void main(String[] args) {
        List<Map<String, String>> asistentes = Arrays.asList(
            Map.of("firstName", "Fatima", "continent", "Africa"),
            Map.of("firstName", "Agustín", "continent", "Americas"),
            Map.of("firstName", "Jing", "continent", "Asia"),
            Map.of("firstName", "Laia", "continent", "Europe"),
            Map.of("firstName", "Oliver", "continent", "Oceania")
        );

        System.out.println(continentesRepresentados(asistentes)); // true
    }
}

    

