import java.util.ArrayList;

public class Ejercicio7 {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager("C:\\Users\\ALUMNO\\Documents\\VSCODE\\Acceso a Datos\\estructuras_basicas\\src\\figurasTXT.txt");

        if(fileManager.Exists()){
            fileManager.importFromFile();
            ArrayList<Figura> figuras = fileManager.getDataFromFile();

            for (Figura figura : figuras){
                figura.toString();
            }
            fileManager.exportToFile("C:\\Users\\ALUMNO\\Documents\\VSCODE\\Acceso a Datos\\estructuras_basicas\\src\\resultados.txt");
        }else {
            System.out.println("El archivo no existe");
        }
    }
}
