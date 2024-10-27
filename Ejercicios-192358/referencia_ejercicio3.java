import java.util.*;
// mostar los arrays sin necesidad de ciclo for 
class ReferenciaEjercicio3 {

    public static void main(String[] args) {
        
        
        int[] listas = {10, 20, 30, 40, 50};

        // Mostrar el valor de listas antes de modificar
        System.out.println("Valor listas antes de modificar = " + Arrays.toString(listas));

        
        ReferenciaEjercicio3 obj = new ReferenciaEjercicio3();
        obj.modificarLista(listas);

        
        System.out.println("Lista ya modificada = " + Arrays.toString(listas));
    }

    
    public void modificarLista(int[] listas) {
        System.out.println("Valor listas dentro del método = " + Arrays.toString(listas));
        listas[0] = 0;  // Modificar el primer elemento del array
    }
}
