import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorInventario {
    ArrayList<Producto> productos = new ArrayList<>();


    public void leerInventario(File file){

        if(file.exists()) {
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String linea;
                while (( linea = bufferedReader.readLine()) != null){
                    String[] contenido =  linea.split("\\|");
                    String cod = contenido[0];
                    String nombre = contenido[1];
                    int cantidad = Integer.parseInt(contenido[2]);
                    double precio = Double.parseDouble(contenido[3]);

                    Producto mostrar = new Producto(cod,nombre,cantidad,precio);
                    productos.add(mostrar);
                    System.out.println(mostrar.toString());
                }
                fileReader.close();
                bufferedReader.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                System.out.println("Error: "+e);
            }
        }else {
            System.out.println("El archivo no existe!");
        }
    }

    public void agregarProductosArchivo(File file){
        BufferedWriter bufferedWriter = null;
            try{
                bufferedWriter = new BufferedWriter(new FileWriter(file));
                Scanner scanner = new Scanner(System.in);

                System.out.println("Ingresa el codigo del producto: ");
                String cod =  scanner.next();
                bufferedWriter.write(cod+"|");
                System.out.println("Ingresa el nombre del producto: ");
                String nombre = scanner.next();
                bufferedWriter.write(nombre+"|");
                System.out.println("Ingresa la cantidad del producto: ");
                int cantidad = scanner.nextInt();
                bufferedWriter.write(cantidad+"|");
                System.out.println("Ingresa el precio del producto: ");
                double precio = scanner.nextDouble();
                bufferedWriter.write(precio+"");

                productos.add(new Producto(cod,nombre,cantidad,precio));

                System.out.println("Archivo creado correctamente");
                bufferedWriter.close();
            } catch (IOException e) {
                System.out.println("Error: "+e);
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

    public void ingresarPorTeclado(){

    }

}

