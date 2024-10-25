package Ejercicio7;

public class Barrera {
    private int totalHilos;
    private int hilosEsperando = 0;

    public Barrera(int totalHilos) {
        this.totalHilos = totalHilos;
    }

    public synchronized void esperarBarrera(String hilo) throws InterruptedException {
        hilosEsperando++;
        System.out.println(hilo + " ha llegado a la barrera");

        if (hilosEsperando == totalHilos) {
            System.out.println("Todos los hilos han llegado a la barrera. ¡Pueden continuar!");
            notifyAll();
        } else {
            while (hilosEsperando < totalHilos) {
                System.out.println("Aún no llegan todos, espera");
                wait();
            }
        }
        System.out.println(hilo + " ha cruzado la barrera y continúa");
    }
}
