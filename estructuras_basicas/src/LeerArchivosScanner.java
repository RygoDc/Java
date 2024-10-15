import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivosScanner {

    public static void main(String[] args) {

        String ruta = "C:\\Users\\ALUMNO\\Documents\\VSCODE\\Acceso a Datos\\estructuras_basicas\\src\\contenido.txt";

        try {
           File archivo = new File(ruta);
            Scanner scanner = new Scanner(archivo);

            while (scanner.hasNextLine()){
                String linea = scanner.nextLine();
                System.out.println(linea);
            }
            scanner.close();
       }
       catch (FileNotFoundException e){
           System.out.println("Archivo no encontrado" + e);
       }
    }
}
