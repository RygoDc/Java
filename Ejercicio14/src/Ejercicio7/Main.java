package Ejercicio7;



public class Main {
    public static void main(String[] args) {

        Barrera barrera = new Barrera();

        Runnable hilo = () ->{
            String nombre = Thread.currentThread().getName();

            try{
                barrera.esperarInicio(nombre);
            }catch (InterruptedException e){
                System.out.println("Error: "+e);
            }
        };
        Thread hilo1 = new Thread(hilo,"Hilo 1");
        Thread hilo2 = new Thread(hilo,"Hilo 2");
        Thread hilo3 = new Thread(hilo,"Hilo 3");

        hilo1.start();
        hilo2.start();
        hilo3.start();

        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            System.out.println("Error:" +e);
        }

        barrera.iniciarJuntos();
    }
}