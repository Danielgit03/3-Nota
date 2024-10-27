
public class EjemploMatriz {
    public static void main(String[] args) {
        // Declarar e inicializar una matriz de 3x3
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




            // calificaiones promedio


        int[] calificaciones = {85, 90, 78, 92, 88};
        int suma = 0;
        
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        
        double promedio = suma / (double) calificaciones.length;
        System.out.println("El promedio de las calificaciones es: " + promedio);




        // Busqueda secuencial Arrays


        int[] numeros = {3, 7, 9, 15, 20};
        int buscado = 9;
        boolean encontrado = false;

        for (int numero : numeros) {
        if (numero == buscado) {
        encontrado = true;
        break;
    }
    }

    if (encontrado) {
    System.out.println("El número " + buscado + " se encontró en el array.");
    } else {
    System.out.println("El número " + buscado + " no está en el array.");
    }


    double[][] precios = {
    {10.5, 12.0, 11.8}, // Precios del producto 1 en las tres tiendas
    {15.0, 13.5, 14.0}, // Precios del producto 2
    {20.5, 19.0, 21.0}, // Precios del producto 3
    {30.0, 29.5, 28.5}  // Precios del producto 4
};

for (int i = 0; i < precios.length; i++) {
    double sumar = 0;
    for (int j = 0; j < precios[i].length; j++) {
        sumar += precios[i][j];
    }
    System.out.println("El promedio de precios del producto " + (i + 1) + " es: " + (sumar / precios[i].length));
}

    }
}