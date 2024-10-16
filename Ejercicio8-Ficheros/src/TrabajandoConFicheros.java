import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TrabajandoConFicheros {
    public static void main(String[] args) {
        File archivo = new File("src/alumnos.txt");

        if (isExists(archivo)) {
            long bits = getBytes(archivo.length());
            leerArchivoFileinputStream();
            leerArchivoYObtenerTamano();
            escribirArchivoFileinputStream();
        }
    }

    public static boolean isExists(File archivo){
        return archivo.exists();
    }

    public static long getBytes(long archivoLength){
        return archivoLength * 8;
    }

    public static void leerArchivoFileinputStream(){

            FileInputStream fis =null;
            try{
                fis = new FileInputStream("src/alumnos.txt");
                int byteLeido;
                while ((byteLeido = fis.read()) != -1){
                    System.out.println((char) byteLeido);
                }
            } catch (IOException e) {
                System.out.println("Error: " +e);
            }
    }

    public static void leerArchivoYObtenerTamano(){
        FileInputStream fis =null;
        try{
            File archivo = new File("src/alumnos.txt");
            if (isExists(archivo)){
                fis = new FileInputStream(archivo);
                long sizeFile = archivo.length(); //vemos tamaño del archivo

                //creamos un array de bytes con el tamaño exacto del archivo
                byte[] contenido = new byte[(int) sizeFile];

                //leemos el contenido del archivo de una sola vez y lo almacenamos en el array
                fis.read(contenido);

                //convertimos el contenido del archivo (que esta en formato bytes) a un String
                System.out.println(new String(contenido));
            }

        } catch (IOException e) {
            System.out.println("Error: " +e);
        }
    }

    public static void escribirArchivoFileinputStream(){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("src/alumnosFileOutput.txt");
            String contenido = "Hola Mundo";

            byte[] bytesContenido = contenido.getBytes();

            fos.write(bytesContenido);
            System.out.println("Creado correctamente");

        } catch (IOException e) {
            System.out.println("Error: " +e);
        }
    }
}
