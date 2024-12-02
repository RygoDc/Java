package Ejercicio8;

public class Main {
    public static void main(String[] args) {

        Fabrica fabrica = new Fabrica();

        Runnable trabajador = () ->{
            String nombre = Thread.currentThread().getName();

            try{
                fabrica.esperarInicio(nombre);
            }catch (InterruptedException e){
                System.out.println("Error: "+e);
            }
        };
        Thread trabajador1 = new Thread(trabajador,"Pepe");
        Thread trabajador2 = new Thread(trabajador,"Manolo");
        Thread trabajador3 = new Thread(trabajador,"Paco");

        trabajador1.start();
        trabajador2.start();
        trabajador3.start();

        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            System.out.println("Error:" +e);
        }

        fabrica.iniciarTrabajo();
    }
}
