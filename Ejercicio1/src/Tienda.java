import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();

        int opcion;

        productos.add(new Producto("Zapatos", 20, 10));
        productos.add(new Producto("Chancla", 15, 5));


        boolean salir = false;
        while (!salir){
            System.out.println("Bienvenido al sistema de Innventario");
            System.out.println("1.- Añadir productos ");
            System.out.println("2.- Mostrar todos los productos");
            System.out.println("3.- Actualizar cantidad y precio de Producto");
            System.out.println("4.- Eliminar producto ");
            System.out.println("5.- Calcular valor total del Inventario");
            System.out.println("6.- SALIR");
            System.out.println("Selecciona una Opcion: ");
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingresa el nombre del producto: ");
                    String nombre = scanner.next();
                    System.out.println("Ingresa el Precio del producto " +nombre + ": ");
                    double precio = scanner.nextDouble();
                    System.out.println("Ingresa la cantidad del producto " +nombre+ ": ");
                    int cantidad = scanner.nextInt();
                    productos.add(new Producto(nombre,precio,cantidad));
                    System.out.println();
                    break;
                case 2:
                    for (Producto producto : productos){
                        System.out.println(producto.toString());
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Ingresa el nombre del producto a actualizar: ");
                    String nombre_producto = scanner.next();
                    boolean salir2 = false;
                    int cont =0;
                    while (!salir2 && cont < productos.size()){
                        if(productos.get(cont).getNombre().equals(nombre_producto)){
                            System.out.println("Ingresa el nuevo precio: ");
                            double precio_actualizado = scanner.nextDouble();
                            productos.get(cont).setPrecio(precio_actualizado);
                            System.out.println("Ingresa la nueva cantidad: ");
                            int cantidad_nueva = scanner.nextInt();
                            productos.get(cont).setCantidad(cantidad_nueva);
                            System.out.println("producto actualizado: " +  productos.get(cont).toString());
                            salir2 = true;
                        }
                        cont++;
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Ingresa el nombre del producto a eliminar: ");
                    String nombre_eliminar = scanner.next();
                    boolean salir3 = false;
                    int cont3 =0;
                    while (!salir && cont3 < productos.size()){
                        if(productos.get(cont3).getNombre().equals(nombre_eliminar)){
                            productos.remove(cont3);
                            salir3 = true;
                        }
                        cont3++;
                    }
                    System.out.println();
                    break;
                case 5:
                    int total = 0;
                    for(Producto producto: productos){
                       total += (int) (producto.cantidad * producto.precio);
                    }
                    System.out.println("El total es: " +total);
                    System.out.println();
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no valida!");
                    System.out.println();
                    break;
            }


        }

    }
}
