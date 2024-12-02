package Ejercicio1Terminal;

import java.io.File;
import java.io.IOException;

public class GuardarInfoEnArchivoMain {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder(); // Ejecuta operaciones en el sistema operativo o en el terminal
        processBuilder.command("cmd.exe","/c","tasklist");

        File file = new File("C:\\Users\\ALUMNO\\Desktop\\tasklist.txt");

        try{
            if(file.exists())
                file.createNewFile();

            processBuilder.redirectOutput(file);
            Process proceso = processBuilder.start();

            int estadoSalida = proceso.waitFor(); //esperar a que el proceso termine y asi obtener el estado de salida
            System.out.println("El proceso termino con el codigo: "+estadoSalida);
        } catch (IOException | InterruptedException e) {
            System.out.println("Error: " +e);
        }
    }
}
