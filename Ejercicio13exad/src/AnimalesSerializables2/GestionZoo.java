package AnimalesSerializables2;

import java.io.File;
import java.util.Scanner;

public class GestionZoo {

    public static void main(String[] args) {

        File file = new File("src/AnimalesSerializables2/zoologico.ser");
        Zoologico zoo = new Zoologico();

        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        while (!salir) {
            System.out.println("1- Introducir un nuevo animal: ");
            System.out.println("2 - Ver todos los animales: ");
            System.out.println("3 - Guardar animales: ");
            System.out.println("4- Introducir un nuevo cuidador: ");
            System.out.println("0 - salir");
            int opt = scanner.nextInt();

            switch (opt) {
                case 1: {
                    System.out.println("\n1 - es ave | 2 - es mamífero");
                    int opt2 = scanner.nextInt();

                    System.out.println("Introduce el nombre: ");
                    String name = scanner.next();

                    System.out.println("Introduce la edad: ");
                    int edad = scanner.nextInt();

                    if (opt2 == 1) {
                        System.out.println("¿Puede volar? s | n");
                        String puedeVolar = scanner.next();
                        zoo.addNewAnimal(
                                new Ave(name, edad, puedeVolar.equalsIgnoreCase("s"))
                        );
                    } else if (opt2 == 2) {
                        System.out.println("¿Tiene pelo? s | n");
                        String tienePelo = scanner.next();
                        zoo.addNewAnimal(
                                new Mamifero(name, edad, tienePelo.equalsIgnoreCase("s"))
                        );
                    } else {
                        System.out.println("Animal no válido");
                    }

                    break;
                }

                case 2: {
                    zoo.lecturaArchivo(file);
                    break;
                }

                case 3: {
                    zoo.escrituraArchivo(file);
                    break;
                }
                case 4: {
                    System.out.println("Introduce nombre de cuidador: ");
                    String name = scanner.next();
                    System.out.println("Introduce edad del cuidador: ");
                    int edad = scanner.nextInt();
                    System.out.println("Introduce area del cuidador: ");
                    String areaResponsable = scanner.next();
                    zoo.addNewCuidador(
                            new Cuidador(name, edad, areaResponsable)
                    );
                    break;
                }
                case 0: {
                    salir = true;
                    break;
                }
                default:
                    System.out.println("Opción no válida");
            }

        }

    }

}
