import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1Oc10 {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        String fichero = "C:\\Users\\ALUMNO\\Documents\\VSCODE\\Acceso a Datos\\estructuras_basicas\\src\\alumnos.txt";
        try {
            FileReader fileReader = new FileReader(fichero);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                String[] datos = linea.split(",");

                String nombre = datos[0];
                int edad = Integer.parseInt(datos[1]);
                String curso = datos[2];
                double nota = Double.parseDouble(datos[3]);

                Alumno alumno = new Alumno(nombre, edad, curso, nota);
                alumnos.add(alumno);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (
                IOException e) {
            System.out.println("ERROR: " + e);
        }

        int opcion;

        boolean salir = false;
        while (!salir){
            System.out.println("Bienvenido");
            System.out.println("1.- Ingresar alumnos por teclado");
            System.out.println("2.- Mostrar todos los alumnos");
            System.out.println("3.- Buscar nota mayor");
            System.out.println("4.- Crear Archivo con alumnos");
            System.out.println("5.- trabajar con ficheros");
            System.out.println("6.- Salir");
            System.out.println("Elige una opción: ");
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre del estudiante: ");
                    String name = scanner.next();
                    System.out.println("Ingrese la edad de " + name + ": ");
                    int edad = scanner.nextInt();
                    System.out.println("Ingrese el ciclo del estudiante: ");
                    String ciclo = scanner.next();
                    System.out.println("Ingrese la nota media de " + name + ": ");
                    double notaMedia = scanner.nextDouble();

                    alumnos.add(new Alumno(name,edad,ciclo,notaMedia));
                    System.out.println("Alumno ingresado correctamente! ");
                    System.out.println();
                    break;
                case 2:
                    System.out.println(alumnos.toString());
                    break;
                case 3:
                    Alumno notaMayor = alumnos.get(0);
                    int nota=1;
                    while (nota< alumnos.size()){
                        if(alumnos.get(nota).getNotaMedia() > notaMayor.getNotaMedia()){
                            notaMayor=alumnos.get(nota);
                        }
                        nota++;
                    }
                    System.out.println("El alumno con la nota mayor es: "+notaMayor);
                    System.out.println();
                    break;
                case 4:
                    String nuevoArchivo = "C:\\Users\\ALUMNO\\Documents\\VSCODE\\Acceso a Datos\\estructuras_basicas\\src\\ArchivoAlumnos.txt";
                    BufferedWriter writter = null;
                    try {
                        writter = new BufferedWriter(new FileWriter(nuevoArchivo));
                        for (Alumno alumno : alumnos){
                            writter.write(alumno.toString());
                            writter.newLine();
                        }
                        System.out.println("Archivo creado correctamente");
                        writter.close();

                    } catch (IOException e) {
                        System.out.println("Error al escribir el archivo "+e);
                    }
                    System.out.println();
                    break;
                case 5:
                    trabajandoConArchivos();
                    break;
                case 6:
                    salir=true;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }

    public static void trabajandoConArchivos(){
        String ruta = "C:\\Users\\ALUMNO\\Documents\\VSCODE\\Acceso a Datos\\estructuras_basicas\\src\\alumnos.txt";
        File f =new File(ruta);

        System.out.println(f.exists());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());

        try {
            File f2 = new File("\"C:\\\\Users\\\\ALUMNO\\\\Documents\\\\VSCODE\\\\Acceso a Datos\\\\estructuras_basicas\\\\src\\\\alumnos2.txt");
            System.out.println(f2.createNewFile());
            System.out.println(f.mkdir());
            System.out.println(f.renameTo(f2));
            System.out.println(f2.delete());

            System.out.println("Puedo leerlo? " + f.canRead());
            System.out.println("Puedo escribir? "+ f.canWrite());
            System.out.println("puedo ejecutarlo? "+ f.canExecute());
            System.out.println("cuales son los bits (tamaño del archivo)? "+ f.length());


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
