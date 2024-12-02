package PrimerEjemplo;

public class MiHilo extends Thread {

    // run() -> Se llama con start()
    // sleep() -> 1000ms (1s), 2000ms (2s)

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hilo " + i);

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Error: " + e);
            }
        }
    }

}
