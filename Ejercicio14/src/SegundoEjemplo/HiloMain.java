package SegundoEjemplo;

public class HiloMain {

    public static void main(String[] args) {
        MiRunnable mirunnable = new MiRunnable();
        Thread hilo = new Thread(mirunnable);

        hilo.start();
    }

}
