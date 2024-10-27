
    import java.util.Arrays;

public class ana {
    public static void main(String[] args) {

        char[] palabra1 = {'A', 'M', 'O', 'R'};
        char[] palabra2 = {'M', 'O', 'Y', 'A'};

        // Verificar si las longitudes son iguales
        if (palabra1.length != palabra2.length) {
            System.out.println("No es anagrama");
            return;
        }

        // Variable para contar coincidencias
        int contador = 0;

        // Recorrer palabra1 y buscar cada letra en palabra2
        for (int i = 0; i < palabra1.length; i++) {
            for (int j = 0; j < palabra2.length; j++) {
                if (palabra1[i] == palabra2[j]) {
                    // Reemplazar la letra encontrada en palabra2 por un espacio vacío
                    palabra2[j] = ' ';
                    contador++;
                    break; // Romper el ciclo interno cuando haya una coincidencia
                }
            }
        }

        // Verificar si todas las letras coincidieron
        if (contador == palabra1.length) {
            System.out.println("Es anagrama");
        } else {
            System.out.println("No es anagrama");
        }
    }
}


