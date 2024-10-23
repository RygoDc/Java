package Ejercicio2;

class Contador{
    private int contador = 0;

    public synchronized void incrementar() {
        this.contador++;
        System.out.println("Contador: " + this.contador);
        if (this.contador == 4)
            System.out.println("Terminó hilo 1");
    }
    public synchronized void decrementar() {
        this.contador--;
        System.out.println("Contador: " + this.contador);
        if (this.contador == 0)
            System.out.println("Terminó hilo 2");
    }
}

public class HiloMain {
    public static void main(String[] args) {
        Contador contador = new Contador();

        Thread hilo1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                contador.incrementar();
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    System.out.println("Error: " + e);
                }
            }

        });

        Thread hilo2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                contador.decrementar();
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    System.out.println("Error: " + e);
                }
            }
        });

        hilo1.start();
        hilo2.start();
    }
}
