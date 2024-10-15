import java.util.ArrayList;
import java.util.Scanner;

public class Veterinario {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        int opcion;

        animales.add(new Perro("Boby",5));
        animales.add(new Perro("Sakura",8));
        animales.add(new Gato("Jacinta",4));
        animales.add(new Gato("Pelusa",6));

        boolean salir = false;
        while (!salir){
            System.out.println("Bienvenido, que desea hacer: ");
            System.out.println("1.- Añadir Animales");
            System.out.println("2.- Mostrar todos los animales");
            System.out.println("3.- Borrar todos los animales");
            System.out.println("4.- Borrar un animal en concreto");
            System.out.println("5.- Salir");
            System.out.println("Elija una opción: ");
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    int selecion;
                    System.out.println("Que deseas agregar;");
                    System.out.println("1.- Perro");
                    System.out.println("2.- Gato");
                    selecion = scanner.nextInt();
                    if (selecion == 1) {
                        System.out.println("Ingrese el nombre del Perro: ");
                        String name = scanner.next();
                        System.out.println("Ingrese la edad de " + name + ": ");
                        int edad = scanner.nextInt();

                        animales.add(new Perro(name, edad));
                        System.out.println("Perro ingresado correctamente! ");
                    }else if (selecion == 2){
                        System.out.println("Ingrese el nombre del Gato: ");
                        String name = scanner.next();
                        System.out.println("Ingrese la edad de " + name + ": ");
                        int edad = scanner.nextInt();

                        animales.add(new Gato(name, edad));
                        System.out.println("Gato ingresado correctamente! ");
                        } else {
                        System.out.println("Opción no válida");
                    }
                        System.out.println();
                    break;
                case 2:
                    if (animales.isEmpty()){
                        System.out.println("No hay animales registrados");
                    }
                    else {
                        System.out.println("Lista de animales: ");
                        for (Animal animal : animales){
                            animal.mostrarInfo();
                            animal.hacerSonido();
                        }
                    }
                    System.out.println();
                    break;
                case 3:
                    animales.clear();
                    System.out.println("Se han eliminado todos los animales");
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del animal a eliminar: ");
                    String eliminar = scanner.next();
                    boolean detener = false;
                    int cont =0;
                    while (!detener){
                        if(animales.get(cont).getNombre().equals(eliminar)){
                            animales.remove(cont);
                            detener = true;
                        }
                        cont++;
                    }
                    System.out.println("Animal eliminado!");
                    System.out.println();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida!");
                    System.out.println();
                    break;
            }
        }
    }
}
