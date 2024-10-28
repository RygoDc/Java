package Ejercicio1;

import java.io.*;
import java.util.ArrayList;

public class Biblioteca implements Serializable {
    private static final long serialVersionUID = 1L;
    ArrayList<GestionableBiblioteca> gestionBiblio;

    public Biblioteca() {
        this.gestionBiblio = new ArrayList<>();
    }

    public void addNewPersonal(PersonalBiblioteca personalBiblioteca) {
        this.gestionBiblio.add(personalBiblioteca);
    }

    public void addNewLibro(Libro libro) {
        this.gestionBiblio.add(libro);
    }

    public void mostrarGestion() {
        if (this.gestionBiblio.isEmpty())
            System.out.println("No hay elementos");

        else {
            for (GestionableBiblioteca gestionableBiblioteca : this.gestionBiblio) {
                System.out.println(gestionableBiblioteca.toString());
            }
        }
    }

    public void escrituraArchivo(File file) {
        try (
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(this.gestionBiblio);
            System.out.println("Archivo creado correctamente");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    public void lecturaArchivo(File file) {
        try (
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            ArrayList<GestionableBiblioteca> lectura = (ArrayList<GestionableBiblioteca>) ois.readObject();
            System.out.println(lectura);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
