import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio9 {
    public static void main(String[] args) {
        File archivo = new File("src/entrada.txt");

        if (archivo.exists()) {
            long bits = getBytes(archivo.length());
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(archivo);
                long sizeFile = archivo.length(); //vemos tamaño del archivo

                //creamos un array de bytes con el tamaño exacto del archivo
                byte[] contenido = new byte[(int) sizeFile];

                //leemos el contenido del archivo de una sola vez y lo almacenamos en el array
                fis.read(contenido);

                FileOutputStream fos = new FileOutputStream("src/salida.bin");

                    byte[] bytesContenido = contenido;

                    fos.write(bytesContenido);
                    System.out.println("Creado correctamente");


            } catch (IOException e) {
                System.out.println("Error: " + e);
            }

        }

    }

    public static long getBytes(long archivoLength) {
        return archivoLength * 8;
    }
}
