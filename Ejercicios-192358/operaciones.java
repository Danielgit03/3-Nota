import java.util.Scanner;

public class operaciones {
    
   

    
    public static void main(String[] args) {
        
 

 Scanner scanner = new Scanner(System.in);
 System.out.print("Ingrese el primer número: ");
 int num1 = scanner.nextInt();
 System.out.print("Ingrese el segundo número: ");
 int num2 = scanner.nextInt();
 int suma = num1 + num2;
 int resta = num1 - num2;
 int multiplicacion = num1 * num2;
 int division = num1 / num2;
 int modulo = num1 % num2;
 System.out.println("Suma: " + suma);
 System.out.println("Resta: " + resta);
 System.out.println("Multiplicación: " + multiplicacion);
 System.out.println("División: " + division);
 System.out.println("Módulo: " + modulo);

     }
    }

