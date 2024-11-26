
import java.util.Scanner;



// Clase Principal para ejecutar el código
public class MAIN {

    //get
    public int base(int base){

return base;

    }

    public int largo(int largo){

        return largo;
        
            }
            public int calcular(int base,int altura){

                return base*altura;
            }
    public static void main(String[] args) {
        MAIN cal=new MAIN();
        Scanner scan =new Scanner(System.in);
        System.out.println("Ingrese el largo y ancho del cuadrilatero");
        int base = scan.nextInt();
        int altura = scan.nextInt();

        cal.base(base);
        cal.largo(altura);
        System.out.println("El resultado es = "+cal.calcular(base, altura));



        scan.close();
    

      
    }
}
