import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        GestorInventario gestorInventarios = new GestorInventario();

        File file = new File("src/inventario.txt");
        boolean salir =false;

        while(!salir){
            System.out.println("Menu");
            System.out.println("1.- Agregar productos por teclado");
            System.out.println("2.- Mostrar productos en inventario");
            System.out.println("3.- Mostrar información del inventario");
            System.out.println("4.- Salir");
            System.out.print("Elige una opcion: ");
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();

            switch (opcion){
                case 1 :

                    gestorInventarios.agregarProductosArchivo(file);
                    System.out.println();
                    break;
                case 2:
                    gestorInventarios.leerInventario(file);
                    System.out.println();
                    break;
                case 3:
                    gestorInventarios.mostrarInfoArchivo(file);
                    System.out.println();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;

            }


        }
    }
}
