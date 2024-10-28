import java.io.*;
import java.util.ArrayList;

public class ImportarAlumnoMain {

    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();

        //todo
        alumnos = readFileTXT(alumnos);
        Alumno notaMasAlta = getAlumnoNotaMasAlta(alumnos);
        // end todo

        for(Alumno alumno: alumnos) {
            System.out.println(alumno.toString());
        }
        System.out.println();
        System.out.println("El alumno con nota más alta es: \n" + notaMasAlta.toString());

        crearArchivoConAlumnos(alumnos);
        trabajandoConArchivos();
    }


    public static ArrayList<Alumno> readFileTXT(ArrayList<Alumno> alumnos) {
        // todo
        String fichero = "src/alumnos.txt";

        try {

            FileReader fileReader = new FileReader(fichero);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                String[] contenido = linea.split(",");

                alumnos.add(new Alumno(contenido[0], contenido[1], contenido[2], contenido[3]));
            }

            fileReader.close();
            bufferedReader.close();

        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }

        return alumnos;
    }

    public static Alumno getAlumnoNotaMasAlta(ArrayList<Alumno> alumnos) {
        Alumno alumnoNotaMasAlta = new Alumno();

        // todo
        float nota = 0;
        for (Alumno alumno: alumnos) {
            if (nota < alumno.getNota()) {
                nota = alumno.getNota();

                alumnoNotaMasAlta = alumno;
            }
        }
        // end todo

        return alumnoNotaMasAlta;
    }


    public static void crearArchivoConAlumnos(ArrayList<Alumno> alumnos) {
        // todo
        String nuevoArchivo = "src/ArchivoAlumnos.txt";

        BufferedWriter writter = null;
        try {

            writter = new BufferedWriter(new FileWriter(nuevoArchivo));
            for (Alumno alumno: alumnos) {
                writter.write(alumno.toString());
                writter.newLine();
            }

            System.out.println("Archivo creado correctamente.");
            writter.close();
        }
        catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e);
        }
        // end todo
    }


    public static void trabajandoConArchivos() {
        System.out.println();
        File f = new File("C:\\Users\\Usuario\\Desktop\\Acceso a datos\\estructuras_basicas\\src\\alumnos.txt");
        System.out.println(f.exists());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());

        try {
            File f2 = new File("C:\\Users\\Usuario\\Desktop\\Acceso a datos\\estructuras_basicas\\src\\alumnos2.txt");
            System.out.println(f2.createNewFile());
            System.out.println(f.mkdir());
            System.out.println(f.renameTo(f2));
            System.out.println(f2.delete());

            System.out.println("¿Puedo leerlo? " + f.canRead());
            System.out.println("¿Puedo escribir? " + f.canWrite());
            System.out.println("¿Puedo ejecutarlo? " + f.canExecute());
            System.out.println("¿Cuales son los bits? " + f.length());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
