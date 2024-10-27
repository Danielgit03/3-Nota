import java.util.Scanner;
public class Arrays_practico {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
    int[] numeros = new int[5];  
    int suma = 0;

    System.out.println("por favor ingrese los 5 numeros");

    for (int i = 0; i < 5; i++) {
        System.out.print("Número " + (i + 1) + ": ");
        numeros[i] = scan.nextInt();
suma +=numeros[i];


    }
    double promedio = suma / (double) numeros.length;

    System.out.println("el promerdio de las sumas = "+promedio);


}

}
