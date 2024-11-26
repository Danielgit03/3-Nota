
import java.util.Scanner;
public class DivisionPorCero {




    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        
        System.out.println("Ingrese el primer numero ");
        int num1= scan.nextInt();
        System.out.println("Ingrese el segundo numero de la division");
        int num2= scan.nextInt();
         
        

        try {
            double resultado = (double )num1 / num2; // Dividir por num2, que puede ser cero
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Ocurrió un error: No se puede dividir por cero.");
        } finally {
            System.out.println("Proceso finalizado.");
        }
        scan.close();
    }
    
}
