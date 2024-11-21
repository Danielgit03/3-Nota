import java.util.Scanner;
public class Comparacion {
    
    public static void main(String[] args) {
        
        Scanner scan =new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        int number1 = scan.nextInt();

        System.out.println("Ingrese el segundo numero numero");
        int number2 = scan.nextInt();

        System.out.println("Ingrese el Tercer numero");
        int number3 = scan.nextInt();

        boolean resultado = (number1>number2 )& (number1>number3);

        System.out.println("El primer numeros es mayor que el segundo y el tercero ? " + resultado);


        scan.close();










    }
}
