package Ejercicio2;

import java.io.File;

public class GestionBiblioteca {

    public static void main(String[] args) {
        String path = "src/Ejercicio2/libros.ser";
        Inventario inventario = new Inventario();

        File file = new File(path);
        Libro libro = new Ficcion("id1","volare","gipsy",3,"ficcion");

        inventario.agregarLibro(libro);
        Libro libro2 = new NoFiccion("id1","volare","gipsy",5,"ciencia");
        inventario.agregarLibro(libro2);
        inventario.mostrarLibros();
        inventario.guardarInventario(file);
        inventario.cargarInventario(file);
    }

}
