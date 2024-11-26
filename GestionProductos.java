import java.util.List;

 class Producto {
    private int id;
    private String nombre;
    private double precio;

    // Constructor
    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{id=" + id + ", nombre='" + nombre + "', precio=" + precio + "}";
    }
}

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class GestionProductos {
    private static final String ARCHIVO_JSON = "productos.json";

    public static void main(String[] args) {
        // Crear una lista de productos inicial
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto(1, "Laptop", 1200.50));
        productos.add(new Producto(2, "Smartphone", 800.99));
        productos.add(new Producto(3, "Tablet", 300.25));

        // Guardar productos en un archivo JSON
        guardarProductosEnJSON(productos);

        // Leer productos desde el archivo JSON
        List<Producto> productosLeidos = leerProductosDesdeJSON();

        // Mostrar los productos leídos
        if (productosLeidos != null) {
            System.out.println("Productos leídos desde el archivo JSON:");
            for (Producto producto : productosLeidos) {
                System.out.println(producto);
            }
        }
    }

    // Método para guardar productos en un archivo JSON
    private static void guardarProductosEnJSON(List<Producto> productos) {
        Gson gson = new Gson();
        try (Writer writer = new FileWriter(ARCHIVO_JSON)) {
            gson.toJson(productos, writer);
            System.out.println("Productos guardados en " + ARCHIVO_JSON);
        } catch (IOException e) {
            System.err.println("Error al guardar productos en JSON: " + e.getMessage());
        }
    }

    // Método para leer productos desde un archivo JSON
    private static List<Producto> leerProductosDesdeJSON() {
        Gson gson = new Gson();
        try (Reader reader = new FileReader(ARCHIVO_JSON)) {
            Type listType = new TypeToken<List<Producto>>() {}.getType();
            return gson.fromJson(reader, listType);
        } catch (IOException e) {
            System.err.println("Error al leer productos desde JSON: " + e.getMessage());
            return null;
        }
    }
}
