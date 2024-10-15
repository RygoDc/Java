import java.util.ArrayList;
import java.util.Scanner;
public class Escuela {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        int opcion;

        estudiantes.add(new Estudiante("Rodrigo",39,10));
        estudiantes.add(new Estudiante("Marcos",26,8));
        estudiantes.add(new Estudiante("Enrique",22,9));

        boolean salir = false;
        while (!salir){
            System.out.println("Bienvenido, que desea hacer: ");
            System.out.println("1.- Añadir estudiante");
            System.out.println("2.- MOstrar todos los estudiantes");
            System.out.println("3.- Eliminar un estudiante por su nombre");
            System.out.println("4.- Calcular y mostrar la nota media de todos los estudiantes");
            System.out.println("5.- Mostrar el estudiante con la nota mas alta");
            System.out.println("6.- Salir");
            System.out.println("Elija una opción: ");
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre del estudiante: ");
                    String name = scanner.next();
                    System.out.println("Ingrese la edad de " + name + ": ");
                    int edad = scanner.nextInt();
                    System.out.println("Ingrese la nota final de " + name + ": ");
                    double notaFinal = scanner.nextDouble();

                    estudiantes.add(new Estudiante(name,edad,notaFinal));
                    System.out.println("Estudiante ingresado correctamente! ");
                    System.out.println();
                    break;
                case 2:
                    for (Estudiante estudiante : estudiantes){
                            System.out.println(estudiante.toString());
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del estudiante a eliminar: ");
                    String eliminar = scanner.next();
                    boolean detener = false;
                    int cont =0;
                    while (!detener){
                        if(estudiantes.get(cont).getNombre().equals(eliminar)){
                            estudiantes.remove(cont);
                            detener = true;
                        }
                        System.out.println("Estudiante eliminado!");
                        cont++;
                    }
                    System.out.println();
                    break;
                case 4:
                    double sumaNotas=0;
                    for(Estudiante estudiante : estudiantes){
                        sumaNotas += estudiante.getNotaFinal();
                    }
                    double notaMedia = sumaNotas/ estudiantes.size();
                    System.out.println("La nota Media es: " + notaMedia);
                    System.out.println();
                    break;
                case 5:
                    Estudiante estudianteNotaMayor = estudiantes.get(0);
                    int nota = 1;
                    while (nota < estudiantes.size()){
                        if(estudiantes.get(nota).getNotaFinal() > estudianteNotaMayor.getNotaFinal()){
                            estudianteNotaMayor = estudiantes.get(nota);
                        }
                        nota++;
                    }
                    System.out.println("El estudiante con la nota mayor es: " + estudianteNotaMayor);
                    System.out.println();
                    break;
                case 6:
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