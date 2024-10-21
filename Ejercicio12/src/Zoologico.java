import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Zoologico {
    public static void main(String[] args) {
        //ArrayList<Animal> animales = new ArrayList<>();
        ArrayList<Gestionable> gestionables = new ArrayList<>();
        File ruta = new File("src/animales.ser");


        boolean salir = false;

        while (!salir){
            System.out.println("Bienvenido al Zoologico");
            System.out.println("1.- Agregar animales");
            System.out.println("2.- Agregar Cuidador");
            System.out.println("3.- Serializar");
            System.out.println("4.- Deserializar y mostrar en pantalla");
            System.out.println("5.- Salir");
            System.out.print("Elige una opción: ");
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Que Animal deseas agregar");
                    System.out.println("1.- Mamífero");
                    System.out.println("2.- Aves");
                    System.out.println("Pulsa cualquier numero distinto para volver al menú");
                    System.out.print("Elige el animal: ");
                    int op_agregar = scanner.nextInt();
                    if (op_agregar == 1) {
                        System.out.println("Nombre del Mamífero: ");
                        String nombre = scanner.next();
                        System.out.println("Edad del Mamífero: ");
                        int edad = scanner.nextInt();
                        System.out.println("Tiene pelo el Mamífero (True/False): ");
                        boolean pelo = scanner.nextBoolean();

                        gestionables.add(new Mamifero(nombre, edad, pelo));
                    }
                    if (op_agregar == 2) {
                        System.out.println("Nombre del Ave: ");
                        String nombre = scanner.next();
                        System.out.println("Edad del Ave: ");
                        int edad = scanner.nextInt();
                        System.out.println("Vuela el Ave (True/False): ");
                        boolean vuela = scanner.nextBoolean();

                        gestionables.add(new Aves(nombre, edad, vuela));
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Nombre del Cuidador: ");
                    String nombre = scanner.next();
                    System.out.println("Edad del Cuidador: ");
                    int edad = scanner.nextInt();
                    System.out.println("Area del Cuidador: ");
                    String area = scanner.next();

                    gestionables.add(new Cuidador(nombre, edad, area));
                    System.out.println();
                    break;
                case 3:
                    try(FileOutputStream fos = new FileOutputStream(ruta); ObjectOutputStream oos = new ObjectOutputStream(fos)){
                        oos.writeObject(gestionables);
                    } catch (IOException e) {
                        System.out.println("Error" +e);
                    }
                    System.out.println();
                    break;
                case 4:
                    ArrayList<Gestionable> gestion = null;
                    try(FileInputStream fis = new FileInputStream(ruta); ObjectInputStream ois = new ObjectInputStream(fis)){
                        gestion = (ArrayList<Gestionable>) ois.readObject();
                        System.out.println(gestion.toString());
                    } catch (FileNotFoundException e) {
                        System.out.println("Error:" +e );
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
                    break;
            }
        }
    }
}
