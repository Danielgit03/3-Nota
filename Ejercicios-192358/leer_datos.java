import java.util.Scanner;
public class leer_datos
{
    public static void main(String[] args) {
      
      
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Ingrese la primera cantidad ");
      int num_1 = scanner.nextInt();
      
      System.out.println("Ingrese la segunda  cantidad ");
      int num_2 = scanner.nextInt();
      
      System.out.println("Ingrese la tercera cantidad ");
      int num_3 = scanner.nextInt();

      double promedio = (double)(num_1+num_2+num_3)/3;
      
       System.out.println("El resultado del promedio de las 3 cantidades es = "+promedio);
      
      
       scanner.close();
    }

}