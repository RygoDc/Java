package NotifAll.CarreraNA;

class Carrera{
    private boolean permiteCorrer =false;

    public synchronized void esperar(String nombre) throws InterruptedException{
        while(!this.permiteCorrer){
            System.out.println("corredor "+nombre+" esperando aviso");
            wait();
        }
        System.out.println(nombre+" comenzo a correr");
    }

    public synchronized void comenzar(){
       this.permiteCorrer=true;
        System.out.println("Ya puede comenzar la carrera");
        notifyAll();
    }
}

public class HiloMainNA1 {
    public static void main(String[] args) {
        Carrera carrera = new Carrera();

        Runnable corredor = () -> {
            String nombre = Thread.currentThread().getName();

            try {
                carrera.esperar(nombre);
                Thread.sleep((long) (Math.random() * 2000));
            } catch (InterruptedException e) {
                System.out.println("Error: " + e);
            }
        };

        Thread corredor1 = new Thread(corredor,"pepe");
        Thread corredor2 = new Thread(corredor,"mariano");
        Thread corredor3 = new Thread(corredor,"jose");
        Thread corredor4 = new Thread(corredor,"gertrudis");

        corredor1.start();
        corredor2.start();
        corredor3.start();
        corredor4.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error: " +e);
        }

        carrera.comenzar();
    }
}
