package Ejercicio1Terminal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EjecutarScriptsPowerShellMain {
        public static void main(String[] args) {
            String ruta = "C:\\Users\\ALUMNO\\Desktop\\script.ps1";
            ProcessBuilder processBuilder = new ProcessBuilder("powershell.exe","-ExecutionPolicy","Bypass","-File",ruta); // Ejecuta operaciones en el sistema operativo o en el terminal

            //processBuilder.command("python",ruta);

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


