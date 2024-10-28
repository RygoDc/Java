import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TrabajandoConFicheros {

    public static void main(String[] args) {

        File archivo = new File("src/alumnos.txt");

        if (isExists(archivo)) {
            // long bits = getBits(archivo.length());
            // leearArchivoFileinputStream();
            leerArchivoYObtenerTamano();
            escribirArchivoFileInputStream();

        }
    }


    public static boolean isExists(File archivo) {
        return archivo.exists();
    }

    public static long getBits(long archivoLength) {
        return archivoLength * 8;
    }

    public static void leearArchivoFileinputStream() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/alumnos.txt");

            int byteLeido;
            while ((byteLeido = fis.read()) != -1) {
                System.out.print((char) byteLeido);
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public static void leerArchivoYObtenerTamano() {
        FileInputStream fis = null;

        try {
            File archivo = new File("src/alumnos.txt");

            if (isExists(archivo)) {
                fis = new FileInputStream(archivo);
                long sizeFile = archivo.length(); // vemos tamaño del archivo

                // Creamos un array de bytes con el tamaño exacto del archivo
                byte[] contenido = new byte[(int) sizeFile];

                // leemos el contenido del archivo de una sola vez y lo almacenamos en el array
                fis.read(contenido);

                // Convertimos el contenido del archivo (que está en formato bytes) a un String
                System.out.println(new String(contenido));
            }

        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }


    public static void escribirArchivoFileInputStream() {
        FileOutputStream fos = null;

        try {

            fos = new FileOutputStream("src/alumnosFileOutput.txt");
            String contenido = "Hola mundo!";

            byte[] bytesContenido = contenido.getBytes();
            fos.write(bytesContenido);

            System.out.println("Creado correctamente");

        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

}
