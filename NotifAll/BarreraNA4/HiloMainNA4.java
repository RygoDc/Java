package NotifAll.BarreraNA4;

class Barrera{
    private int totalHilos=3;
    private int hilosEsperando=0;

    public synchronized void esperar(String nombre) throws InterruptedException{
        this.hilosEsperando++;
        System.out.println(nombre +" ha llegado a la barrera");

        if(this.hilosEsperando < this.totalHilos) {
            System.out.println("Aun no llegan todos "+nombre+" esperando");
            wait();
        }else {
            comenzar();
        }
        System.out.println(nombre+" ha comenzado");

    }
    public synchronized void comenzar(){
        System.out.println("LLEGARON TODOS A LA BARRERA, COMIENCEN");
        notifyAll();
        }
    }


public class HiloMainNA4 {
    public static void main(String[] args) {
        Barrera barrera = new Barrera();

        Runnable hilos = () ->{
            String nombre = Thread.currentThread().getName();
            try {
                barrera.esperar(nombre);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error: " +e);
            }
        };

        Thread hilo1 = new Thread(hilos,"HILO 1");
        Thread hilo2 = new Thread(hilos,"HILO 2");
        Thread hilo3 = new Thread(hilos,"HILO 3");

        hilo1.start();
        hilo2.start();
        hilo3.start();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println("Error: "+e);
        }

    }
}
