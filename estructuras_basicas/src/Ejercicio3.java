import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        //instancias
        vehiculos.add(new Coche("Nissan",180,40));
        vehiculos.add(new Coche("Ford",200,60));
        vehiculos.add(new Bicicleta("Oxford",120,"Carrera"));
        vehiculos.add(new Bicicleta("Shimano",100,"Montaña"));

        //mostrar la informacion completa
        for(Vehiculo vehiculo: vehiculos){
            System.out.println(vehiculo.toString());
            vehiculo.acelerar();
        }
    }
}
