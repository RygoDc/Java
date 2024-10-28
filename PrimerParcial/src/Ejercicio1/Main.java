package Ejercicio1;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("src/Ejercicio1/Biblioteca.ser");
        Biblioteca biblioteca = new Biblioteca();

        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        while (!salir) {
            System.out.println("1 - Agregar un Libro o Personal de Biblioteca: ");
            System.out.println("2 - Mostrar todos los elementos: ");
            System.out.println("3 - Guardar los datos en un archivo: ");
            System.out.println("4 - Cargar los datos desde un archivo: ");
            System.out.println("5 - salir");
            System.out.println("Ingresa tu opcion:");
            int opt = scanner.nextInt();
            switch (opt) {
                case 1: {
                    System.out.println("Que deseas agregar");
                    System.out.println("1.- Libro");
                    System.out.println("2.- Personal de Biblioteca");
                    System.out.println("Pulsa cualquier numero distinto para volver al menú");
                    System.out.print("Elige tu opcion: ");
                    int op_agregar = scanner.nextInt();
                    if (op_agregar == 1) {
                        System.out.println("Introduce el titulo: ");
                        String titulo = scanner.next();

                        System.out.println("Introduce el autor: ");
                        String autor = scanner.next();

                        System.out.println("Introduce el año de publicacion: ");
                        int anio= scanner.nextInt();

                        biblioteca.addNewLibro(new Libro(titulo,autor,anio));
                    }
                    if (op_agregar == 2) {
                        System.out.println("Introduce nombre de Personal de Biblioteca: ");
                        String name = scanner.next();
                        System.out.println("Introduce puesto de Personal de Biblioteca: ");
                        String puesto = scanner.next();
                        System.out.println("Introduce las horas de trabajo: ");
                        int horas = scanner.nextInt();

                        biblioteca.addNewPersonal(
                                new PersonalBiblioteca(name,puesto,horas));
                    }
                    System.out.println();
                    break;
                }

                case 2: {
                    biblioteca.mostrarGestion();
                    break;
                }

                case 3: {
                    biblioteca.escrituraArchivo(file);
                    break;
                }
                case 4: {
                    biblioteca.lecturaArchivo(file);
                    break;
                }
                case 5: {
                    salir = true;
                    break;
                }
                default:
                    System.out.println("Opción no válida");
            }

        }
    }
}

