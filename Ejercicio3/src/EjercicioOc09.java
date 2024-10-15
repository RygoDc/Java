import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioOc09 {

    public static void main(String[] args) {

        TelefonoInteligente telefonoInteligente = new TelefonoInteligente();
        Tablet tablet = new Tablet();

        //TELEFONO
        telefonoInteligente.encender();
        telefonoInteligente.conectarWifi();
        telefonoInteligente.desconectarWifi();
        asignarMarca();
        leerArchivo();

        //TABLET
        tablet.encender();
        tablet.conectarWifi();
        tablet.desconectarWifi();
        }

    static void asignarMarca(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la Marca del dispositivo: ");
        String marca = scanner.next();
        TelefonoInteligente telefono = new TelefonoInteligente(marca);
        System.out.println(telefono.toString());
        scanner.close();
    }

    static void leerArchivo(){
        ArrayList<TelefonoInteligente> telefonoInteligenteArrayList = new ArrayList<>();

        String fichero = "C:\\Users\\ALUMNO\\Documents\\VSCODE\\Acceso a Datos\\estructuras_basicas\\src\\mis-dispositivos.txt";

        try {
            FileReader fileReader = new FileReader(fichero);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String marca;
            System.out.println("Marcas en archivo: ");
            while ((marca = bufferedReader.readLine()) != null) {
                System.out.println(marca);
                telefonoInteligenteArrayList.add(new TelefonoInteligente(marca));
            }
            System.out.println(telefonoInteligenteArrayList.toString());
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("ERROR: " + e);
        }
    }

}


