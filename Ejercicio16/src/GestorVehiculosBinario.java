import java.io.*;
import java.util.ArrayList;

public class GestorVehiculosBinario {
    ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public void verificarArchivo(File file){
        if(!file.exists()){
            try{
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            }catch (IOException e){
                System.out.println("Error: "+e);
            }
        }else{
            System.out.println("El tamaño del archivo es: "+file.length());
        }
    }

    public void leerFichero(File file){
        try(FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)){
            ArrayList<Vehiculo> gestion = (ArrayList<Vehiculo>) ois.readObject();
            System.out.println(gestion.toString());
        } catch (FileNotFoundException e) {
            System.out.println("Error:" +e );
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void agregarCoche(File file){
        try(FileOutputStream fos = new FileOutputStream(file);ObjectOutputStream oos = new ObjectOutputStream(fos);){
            vehiculos.add(new Coche("aaaaa","bbbbb","cccc","2004","coche"));
            vehiculos.add(new Coche("bbbb","bbbbb","cccc","2004","coche"));
            vehiculos.add(new Coche("cccc","bbbbb","cccc","2004","coche"));


            oos.writeObject(vehiculos);

            System.out.println("Creado correctamente");

        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

}
