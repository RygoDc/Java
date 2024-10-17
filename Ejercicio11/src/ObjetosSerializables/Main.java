package ObjetosSerializables;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleados> empleados = new ArrayList<>();

        String ruta = "src/ObjetosSerializables/empleados.ser";
        boolean salir = false;
        while (!salir){
            System.out.println("Que desea hacer");
            System.out.println("1.- Serializar la lista de empleados ");
            System.out.println("2.- Descerializar y mostrar en pantalla");
            System.out.println("3.- Agregar nuevos empleados");
            System.out.println("4.- Salir");
            System.out.print("Ingresa una opción: ");
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    try(FileOutputStream fos = new FileOutputStream(ruta);
                        ObjectOutputStream salida = new ObjectOutputStream(fos)){
                        salida.writeObject(empleados);

                    } catch (IOException e) {
                        System.out.println("Error:" +e);
                    }
                    System.out.println();
                    break;
                case 2:
                    ArrayList<Empleados> empleados1 =null;
                    try(FileInputStream fis = new FileInputStream(ruta);
                        ObjectInputStream entrada = new ObjectInputStream(fis)){

                        empleados1 = (ArrayList<Empleados>) entrada.readObject();
                        System.out.println(empleados1.toString());

                    } catch (IOException e) {
                        System.out.println("Error:" +e);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Ingresa el nombre: ");
                    String nombre = scanner.next();
                    System.out.println("Ingresa la edad: ");
                    int edad = scanner.nextInt();
                    System.out.println("Ingresa su salario: ");
                    double salario = scanner.nextDouble();

                    empleados.add(new Empleados(nombre,edad,salario));
                    System.out.println();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    System.out.println();
                    break;
            }
        }
    }
}
