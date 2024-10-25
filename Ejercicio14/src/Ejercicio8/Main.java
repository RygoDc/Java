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
        Thread trabajador1 = new Thread(trabajador,"Trabajador 1");
        Thread trabajador2 = new Thread(trabajador,"Trabajador 2");
        Thread trabajador3 = new Thread(trabajador,"Trabajador 3");

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
