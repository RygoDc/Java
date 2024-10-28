package Ejercicio2;

import Ejercicio1.GestionableBiblioteca;

import java.io.*;
import java.util.ArrayList;

public class Inventario implements Serializable {
    private static final long serialVersionUID = 1L;
    private ArrayList<Libro> libros;

    public Inventario() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {
        if (this.libros.isEmpty())
            System.out.println("No hay elementos");

        else {
            for (Libro libro : this.libros) {
                System.out.println(libro.toString());
            }
        }
    }

    public void guardarInventario(File file) {
        try (
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(this.libros);
            System.out.println("Archivo creado correctamente");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        // Completar usando ObjectOutputStream para guardar la lista de libros en el archivo
    }

    public void cargarInventario(File file) {
        try (
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            ArrayList<Libro> lectura = (ArrayList<Libro>) ois.readObject();
            System.out.println(lectura);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
