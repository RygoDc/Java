package Ejercicio3;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        GestorNotas gestorNotas = new GestorNotas();

        File file = new File("src/Ejercicio3/notas_estudiantes.txt");

        boolean salir =false;

        while(!salir){
            System.out.println("Menu");
            System.out.println("1.- Verificar y crear archivo");
            System.out.println("2.- Leer Notas");
            System.out.println("3.- Mostrar información del archivo");
            System.out.println("4.- Agregar Lineas");
            System.out.println("5.- Salir");
            System.out.print("Elige una opcion: ");
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();

            switch (opcion){
                case 1 :
                    gestorNotas.verificarYCrearArchivo(file);
                    System.out.println();
                    break;
                case 2:
                    gestorNotas.leerNotas(file);
                    System.out.println();
                    break;
                case 3:
                    gestorNotas.mostrarInfoArchivo(file);
                    System.out.println();
                    break;
                case 4:
                    gestorNotas.agregarLineas(file);
                    System.out.println();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;

            }
        }
    }
}
