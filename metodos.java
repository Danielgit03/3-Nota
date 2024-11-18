



import java.util.Scanner;

public class metodos {


    public static void main(String[] args) {
        
      Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese el numero del factorial que desea calcular ");
      int facto = scan.nextInt();
        
      System.out.println("El resultado del factorial es : "+factorial(facto));

        scan.close();
    }

    public static int factorial(int factorial){
        int i=1;
     while(factorial>0){

       i*= factorial ;
       factorial--;
     }
   return i;

   }
}



