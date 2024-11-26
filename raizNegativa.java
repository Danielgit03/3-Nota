
import java.util.Scanner;




class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}
public class raizNegativa {
    

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("CALCULADORA DE LA RAIZ CUADRADA DE UN NUMERO");
        System.out.println("Ingrese el numero que desea calcular la raiz cuadrada");
        double numero1 =scan.nextDouble();

        try {
            double raiz =calcularRaiz(numero1);
            System.out.println("La raiz cuadrada del numero "+numero1+" es  = "+ raiz);
        } catch (NumeroNegativoException e) {
            System.out.println("Error :"+e.getMessage());
        }finally{
             System.out.println("Ejecucion finalizada");
        scan.close();
        }

        


       
    }

    public static double calcularRaiz(double numero)throws NumeroNegativoException {
        if(numero < 0){
            throw new NumeroNegativoException(" los numeros negativos no se les puede sacar raiz");
        } System.out.println("Accion permitida");{

        }
        return Math.sqrt(numero) ;
    }
}
