package AnimalesSerializables2;

import java.io.*;
import java.util.ArrayList;

public class Zoologico implements Serializable {

    private static final long serialVersionUID = 1L;
    ArrayList<Gestionable> animales;

    public Zoologico() {
        this.animales = new ArrayList<>();
    }

    public void addNewCuidador(Cuidador cuidador) {
        this.animales.add(cuidador);
    }

    public void addNewAnimal(Animal animal) {
        this.animales.add(animal);
    }

    public void mostrarGestion() {
        if (this.animales.isEmpty())
            System.out.println("No hay elementos");

        else {
            for (Gestionable gestionable : this.animales) {
                System.out.println(gestionable.toString());
            }
        }
    }


    public void escrituraArchivo(File file) {
        try (
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream salida = new ObjectOutputStream(fos)
        ) {
            salida.writeObject(this.animales);
            System.out.println("Archivo creado correctamente");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    @SuppressWarnings("uncheked")
    public void lecturaArchivo(File file) {
        try (
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream entrada = new ObjectInputStream(fis)
        ) {
            ArrayList<Gestionable> lecturaAnimales = (ArrayList<Gestionable>) entrada.readObject();
            System.out.println(lecturaAnimales);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
