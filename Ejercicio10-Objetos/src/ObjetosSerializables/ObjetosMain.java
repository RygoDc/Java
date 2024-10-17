package ObjetosSerializables;

import java.io.*;

public class ObjetosMain {
    public static void main(String[] args) {

        Persona persona = new Persona("Juan",27);

        try(FileOutputStream fos = new FileOutputStream("src/ObjetosSerializables/persona.ser");
            ObjectOutputStream salida = new ObjectOutputStream(fos)){
            salida.writeObject(persona);

        } catch (IOException e) {
            System.out.println("Error:" +e);
        }
        leerArchivo();
    }
    public static void leerArchivo(){
        Persona persona2 = null;

        try(FileInputStream fis = new FileInputStream("src/ObjetosSerializables/persona.ser");
            ObjectInputStream entrada = new ObjectInputStream(fis)){
            persona2 = (Persona) entrada.readObject();
            System.out.println(persona2.toString());

        } catch (IOException e) {
            System.out.println("Error:" +e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
