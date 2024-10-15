import java.io.*;
import java.util.Scanner;

public class Ejercicio2Oc10 {
    public static void main(String[] args) throws IOException {
        String fichero = "C:\\Users\\ALUMNO\\Documents\\VSCODE\\Acceso a Datos\\estructuras_basicas\\src\\prueba.txt";
        String letras = "aeiou";
        File f = new File(fichero);

        try {
            if(f.exists()) {
                FileReader fileReader = new FileReader(fichero);
                BufferedReader lector = new BufferedReader(fileReader);
                int contadorLetras=0;
                String linea;
                while ((linea = lector.readLine()) !=null){
                    System.out.println(linea);
                    System.out.println(linea.length());
                    for (int i = 0; i < linea.length(); i++) {
                        System.out.println(Character.toLowerCase(linea.charAt(i)));
                        if((Character.toLowerCase(linea.charAt(i))=='a') || (Character.toLowerCase(linea.charAt(i))=='e') || (Character.toLowerCase(linea.charAt(i))=='i') || (Character.toLowerCase(linea.charAt(i))=='o') || (Character.toLowerCase(linea.charAt(i))=='u')){
                            contadorLetras++;
                        }
                    }
                }
                lector.close();
                System.out.println("El archivo contiene " + contadorLetras + " vocales.");
            }
            else
                System.out.println(f.createNewFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
