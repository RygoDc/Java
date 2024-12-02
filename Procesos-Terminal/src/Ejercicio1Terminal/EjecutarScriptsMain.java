package Ejercicio1Terminal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EjecutarScriptsMain {
        public static void main(String[] args) {
            ProcessBuilder processBuilder = new ProcessBuilder(); // Ejecuta operaciones en el sistema operativo o en el terminal
            String ruta = "C:\\Users\\ALUMNO\\Desktop\\hola.py";
            processBuilder.command("python",ruta);

            try{
                Process proceso = processBuilder.start();

                BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
                String linea;
                while ((linea = reader.readLine()) !=null){
                    System.out.println(linea);
                }
                int estadoSalida = proceso.waitFor(); //esperar a que el proceso termine y asi obtener el estado de salida
                System.out.println("El proceso termino con el codigo: "+estadoSalida);
            } catch (IOException | InterruptedException e) {
                System.out.println("Error: " +e);
            }
        }
    }


