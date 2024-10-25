package Ejercicio7;

public class Main {
    public static void main(String[] args) {

        Barrera barrera = new Barrera(3);

        Runnable hilo = () ->{
            String nombre = Thread.currentThread().getName();

            try{
                Thread.sleep((int) (Math.random()*1000));
                barrera.esperarBarrera(nombre);
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
    }
}
