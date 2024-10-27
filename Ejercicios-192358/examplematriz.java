

public class examplematriz {
    
    public static void main(String[] args) {
        
        int [] numeros = {12,50,20,70,10};


        

        System.out.println("El primer número es: " + numeros[0]); 
        System.out.println("El segundo número es: " + numeros[1]); 

// se cuenta desde el cero 0 
 // Modificar un elemento del array
 numeros[2] = 100; // lo que esta entre llaves es la poscicion del numero de dato q esta dentro de la lista
 System.out.println("El tercer número ahora es: " + numeros[2]); 

 int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Imprimir todos los elementos de la matriz
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println(); // Salto de línea para cada fila


    }
    
    }
}
