import java.io.*;
import java.util.Scanner;

class Libro {
    private String titulo;
    private String autor;
    private String isbn;

    // Constructor
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    // Getters y Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn;
    }
}

public class GestionLibros {
    private static final String ARCHIVO_LIBROS = "libros.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nGestión de Libros:");
            System.out.println("1. Añadir libro");
            System.out.println("2. Buscar libro por título");
            System.out.println("3. Listar todos los libros");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    añadirLibro(scanner);
                    break;
                case 2:
                    buscarLibro(scanner);
                    break;
                case 3:
                    listarLibros();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void añadirLibro(Scanner scanner) {
        System.out.print("Introduce el título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Introduce el autor del libro: ");
        String autor = scanner.nextLine();
        System.out.print("Introduce el ISBN del libro: ");
        String isbn = scanner.nextLine();

        Libro libro = new Libro(titulo, autor, isbn);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_LIBROS, true))) {
            writer.write(libro.getTitulo() + ";" + libro.getAutor() + ";" + libro.getIsbn());
            writer.newLine();
            System.out.println("Libro añadido con éxito.");
        } catch (IOException e) {
            System.out.println("Error al guardar el libro: " + e.getMessage());
        }
    }

    private static void buscarLibro(Scanner scanner) {
        System.out.print("Introduce el título del libro a buscar: ");
        String tituloBuscado = scanner.nextLine();
        boolean encontrado = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_LIBROS))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length == 3 && datos[0].equalsIgnoreCase(tituloBuscado)) {
                    System.out.println("Libro encontrado: " + new Libro(datos[0], datos[1], datos[2]));
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("No se encontró un libro con el título: " + tituloBuscado);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    private static void listarLibros() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_LIBROS))) {
            String linea;
            System.out.println("\nLista de libros:");
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length == 3) {
                    System.out.println(new Libro(datos[0], datos[1], datos[2]));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No hay libros guardados aún.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
