import java.util.*;

public class MoverCeros {

    public static Object[] moverCeros(Object[] array) {
        int index = 0; 
        
        for (int i = 0; i < array.length; i++) {
            if (!(array[i] instanceof Integer && (Integer) array[i] == 0)) {
                // Mueve los elementos no cero al frente
                Object temp = array[index];
                array[index] = array[i];
                array[i] = temp;
                index++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Object[] array = {false, 1, 0, 1, 2, 0, 1, 3, "a"};
        System.out.println(Arrays.toString(moverCeros(array))); 
        // Salida: [false, 1, 1, 2, 1, 3, a, 0, 0]
    }
}

