
import java.util.ArrayList;
import java.util.Scanner;


 class ExcepcionPersonalizada extends Exception{
    public ExcepcionPersonalizada(String mensaje) {
        super(mensaje);
    }

}

 
public class GestionListas {
    

    public static void main(String[] args) {


        // Crear una lista genérica
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Menú de opciones
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\nGestión de Lista:");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar elemento por índice");
            System.out.println("3. Obtener elemento por índice");
            System.out.println("4. Mostrar lista");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1: // Agregar elemento
                        System.out.print("Introduce el elemento a agregar: ");
                        String elemento = scanner.nextLine();
                        lista.add(elemento);
                        System.out.println("Elemento agregado con éxito.");
                        break;

                    case 2: // Eliminar elemento por índice
                        System.out.print("Introduce el índice del elemento a eliminar: ");
                        int indiceEliminar = Integer.parseInt(scanner.nextLine());
                        String eliminado = lista.remove(indiceEliminar);
                        System.out.println("Elemento eliminado: " + eliminado);
                        break;

                    case 3: // Obtener elemento por índice
                        System.out.print("Introduce el índice del elemento a obtener: ");
                        int indiceObtener = Integer.parseInt(scanner.nextLine());
                        String obtenido = lista.get(indiceObtener);
                        System.out.println("Elemento en el índice " + indiceObtener + ": " + obtenido);
                        break;

                    case 4: // Mostrar lista
                        System.out.println("Contenido de la lista: " + lista);
                        break;

                    case 0: // Salir
                        System.out.println("Saliendo del programa.");
                        break;

                    default:
                        System.out.println("Opción no válida. Intenta de nuevo.");
                        break;
                }
                
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error: El índice proporcionado está fuera de rango.");
            } catch (NumberFormatException e) {
                System.out.println("Error: Entrada inválida. Introduce un número válido.");
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }
        }

        scanner.close();
        


    }

}
