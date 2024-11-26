public class palindromo {

    // Método principal para probar la función
    public static void main(String[] args) {
        System.out.println(puedeSerPalindromo(5));         // true
        System.out.println(puedeSerPalindromo(2121));      // true
        System.out.println(puedeSerPalindromo(1331));      // true
        System.out.println(puedeSerPalindromo(3357665));   // false (corregido)
        System.out.println(puedeSerPalindromo(1294));      // false
    }

    // Función para verificar si un número puede ser reordenado como un palíndromo
    public static boolean puedeSerPalindromo(int numero) {
        // Convertir el número a una cadena
        String numStr = String.valueOf(numero);

        // Array de conteo de frecuencia para los dígitos del 0 al 9
        int[] conteo = new int[10];

        // Contar la frecuencia de cada dígito
        for (char c : numStr.toCharArray()) {
            int digito = c - '0';
            conteo[digito]++;
        }

        // Contar cuántos dígitos tienen una frecuencia impar
        int impares = 0;
        for (int freq : conteo) {
            if (freq % 2 != 0) {
                impares++;
            }
        }

        // Un número puede ser reordenado para formar un palíndromo si como máximo un dígito tiene una frecuencia impar
        return impares <= 1;
    }
}
