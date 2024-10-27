

public class primos_numeros {
    
    public static void main(String[] args) {
        


        for (int i = 2; i <= 100; i++) {
            boolean esPrimo = true;

            // Verificar si   i   es divisible por algún número menor que él
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;  // No es primo, salir del bucle
                }
            }

            if (esPrimo) {
                System.out.print(i + " ");
            }
        }
       




      
    }
}

