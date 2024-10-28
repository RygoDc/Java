package Ejercicio3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorNotas {
    ArrayList<Estudiante> estudiante = new ArrayList<>();

    public void verificarYCrearArchivo(File file){
        if(!file.exists()) {
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("El archivo ya existe en la ruta especificada");
        }
    }

    public void leerNotas(File file) {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                String[] contenido = linea.split("\\|");
                String nombre = contenido[0];
                double nota = Double.parseDouble(contenido[1]);

                Estudiante mostrar = new Estudiante(nombre, nota);
                estudiante.add(mostrar);
                System.out.println(mostrar.toString());
            }
            fileReader.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public void mostrarInfoArchivo(File file){
        if(file.exists()){
            System.out.println("El archivo si existe!");
            System.out.println("El tamaño del archivo en bytes es: "+file.length());
        }else{
            System.out.println("Archivo no existe");
        }
    }

    public void agregarLineas(File file){
        BufferedWriter bufferedWriter = null;
        try{
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingresa el nombre: ");
            String nombre =  scanner.next();

            System.out.println("Ingresa la nota: ");
            double nota = scanner.nextDouble();

            estudiante.add(new Estudiante(nombre,nota));

            for (Estudiante estudiante1: estudiante) {
                bufferedWriter.write(estudiante1.toString());
                bufferedWriter.newLine();
            }

            System.out.println("Archivo creado correctamente");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error: "+e);
        }
    }
}
