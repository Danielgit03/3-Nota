import java.util.Scanner;
public class swith_poligonos {

    public static void main(String[] args) {
        

        Scanner scan = new Scanner (System.in);

        System.out.println("----------------MENU----------------------- ");
        System.out.println("------------------------------------------- ");
        System.out.println("1.===================================== Triangulo ");
        System.out.println("2.======================================= Cuadrado ");
        System.out.println("3.=======================================Rectangulo ");
        System.out.println("4.=========================================Salir ");

        System.out.println("elija una opcion a de la figura que desea calcular el area ");

       int mitad =2;
        double Area = 0;
        int opcion =scan.nextInt();
        do {
            
            System.out.println("--------------------MENU-------------------------- ");
            System.out.println("-------------------------------------------------");
            System.out.println("1.===================================== Triangulo ");
            System.out.println("2.======================================= Cuadrado ");
            System.out.println("3.=======================================Rectangulo ");
            System.out.println("4.=========================================Salir ");
            System.out.println("elija una opcion a de la figura que desea calcular el area ");
    
           
            switch (opcion) {
                case 1:
                    
                System.out.println("Ingrese la base del Triangulo");
                double base = scan.nextDouble();
                System.out.println("Ingrese la altura del Triangulo");
                double altura = scan.nextDouble();
                Area = (base*altura)/mitad;
                System.out.println("El Area del triangulo es ="+Area);
        
                    break;
                case 2:
                System.out.println("Ingrese el lado del cuadrado");
                    double lado =scan.nextDouble();
                    Area=lado*lado;
                    System.out.println("El Area del cuadrado es ="+Area);
        
                    break;
                case 3:
                System.out.println("Ingrese la base del Rectangulo");
                double baseRectangulo = scan.nextDouble();
                System.out.println("Ingrese la altura del Rectangulo");
                double alturaRectangulo= scan.nextDouble();
                Area=baseRectangulo*alturaRectangulo;
                System.out.println("El Area del rectangulo  es ="+Area);
        
                

                    break;
            
                default:
                System.out.println("Error ingrese un numero valido ");
                
                scan.close();
                    break;
            }



        
        } while (opcion !=4);
        
        
       
        
        
























        scan.close();
    }
    
}
